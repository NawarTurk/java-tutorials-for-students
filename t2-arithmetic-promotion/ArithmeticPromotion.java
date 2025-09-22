/*
Promotion Order (Widening):
short → int → long → float → double
byte → int → long → float → double
char → int → long → float → double

Binary Numeric Promotion (actual rule used by +, -, *, /, %):
1) If either operand is double → both to double
2) else if either is float  → both to float
3) else if either is long   → both to long
4) else                     → both to int (byte/short/char → int)

Unary Numeric Promotion:
- For unary +, -, ~ : byte/short/char are promoted to int.
- ++/-- work on the variable’s own type, but `b = b + 1` still promotes to int.

Rules:
- Arithmetic is performed after promotion.
- boolean cannot be promoted or used in arithmetic.
*/
class ArithmeticPromotion {
    public static void main(String[] args) {
        int ex1 = 2 / 4;                           // 0
        System.out.println("2 / 4 = " + ex1);      // 2 / 4 = 0

        // aByte + anotherByte → byte/byte promoted to int
        byte aByte = 10;
        byte anotherByte = 20;
        int sumBytes = aByte + anotherByte;        // promoted to int
        System.out.println("aByte + anotherByte = " + sumBytes);  // aByte + anotherByte = 30

        // aLong + anInt * aDouble
        // Step 1: anInt * aDouble = double (* takes the precedence)
        // Step 2: aLong + (double) → aLong promoted to double → result is double
        long aLong = 2L;
        int anInt = 3;
        double aDouble = 4.5;
        double mixedResult = aLong + anInt * aDouble;             // 2 + (3 * 4.5) = 15.5
        System.out.println("aLong + anInt * aDouble = " + mixedResult);  // ... = 15.5

        // aFloat - aBoolean → ❌ INVALID
        float aFloat = 1.5f;
        boolean aBoolean = true;
        // float invalid = aFloat - aBoolean; // Compile-time error

        // Additional Example: 
        // 2 / 4 * 1.0 → 2/4 = 0 → 0 * 1.0 = 0.0
        double ex2 = 2 / 4 * 1.0;
        System.out.println("2 / 4 * 1.0 = " + ex2);               // 2 / 4 * 1.0 = 0.0

        // 1.0 * 2 / 4 → 1.0 * 2 = 2.0 → 2.0 / 4 = 0.5
        double ex3 = 1.0 * 2 / 4;
        System.out.println("1.0 * 2 / 4 = " + ex3);               // 1.0 * 2 / 4 = 0.5

        // byte + byte always promotes to int
        byte a = 1, b = 2;
        int byteSum = a + b;
        System.out.println("byte + byte = " + byteSum);           // byte + byte = 3

        // assign back to byte requires cast (if we are using variables  (not compile-time constants), here we are using a and b, we are not using constants like 3 and 4 for example)
        byte byteSumCasted = (byte) (a + b);
        System.out.println("casted byte sum = " + byteSumCasted); // casted byte sum = 3

        // BUT: compile-time constants within range can narrow implicitly
        byte constByte = 1 + 2; // OK: 3 fits in byte at compile time
        System.out.println("const 1+2 to byte = " + constByte);   // const 1+2 to byte = 3

        // short + short → int (needs cast to store in short)
        short s1 = 7, s2 = 8;
        int shortSumInt = s1 + s2;                                // promoted to int
        short shortSum = (short) (s1 + s2);  // if we want it back in short
        System.out.println("short + short (int) = " + shortSumInt); // ... = 15
        System.out.println("short + short (cast back) = " + shortSum); // ... = 15

        // int + double → int promoted to double
        int x = 2;
        double y = 3.0;
        double result = x + y;
        System.out.println("int + double = " + result);           // int + double = 5.0

        // char + int: char 'A' = 65 → promoted to int → 65 + 5 = 70
        char ch = 'A';
        int i = 5;
        int charIntSum = ch + i;
        System.out.println("char + int = " + charIntSum);         // char + int = 70

        // char + char → int (both promoted)
        char c1 = 'A';  // 65
        char c2 = 'B';    // 66
        int charChar = c1 + c2;                                   // 65 + 66 = 67
        System.out.println("char + char = " + charChar);          // char + char = 67
        char nextChar = (char) (c1 + 2);
        System.out.println("cast back to char = " + nextChar);    // cast back to char = C

        // long + float → float (float wins over long)
        long L = 2L;
        float F = 3.25f;
        float lf = L + F;                                         // 2.0f + 3.25f = 5.25f
        System.out.println("long + float = " + lf);               // long + float = 5.25

        // float + double → double
        double fd = F + 1.0;                                      // promoted to double
        System.out.println("float + double = " + fd);             // float + double = 4.25
    }
}

