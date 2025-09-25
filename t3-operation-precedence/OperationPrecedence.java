// OperationPrecedence.java
// 10 examples showing operator precedence in Java
// Each example is reduced step by step following precedence order

public class OperationPrecedence{
    public static void main(String[] args) {

        // Example 1: Parentheses first
        int ex1 = (4 + 3) * 2;
        // Step 1: (4+3)=7
        // Step 2: 7*2=14
        System.out.println("Ex1: " + ex1); // Output: 14

        // Example 2: Multiplication before addition
        int ex2 = 4 + 3 * 2;
        // Step 1: 3*2=6
        // Step 2: 4+6=10
        System.out.println("Ex2: " + ex2); // Output: 10

        // Example 3: Division before subtraction
        int ex3 = 20 - 8 / 4;
        // Step 1: 8/4=2
        // Step 2: 20-2=18
        System.out.println("Ex3: " + ex3); // Output: 18

        // Example 4: Parentheses → Unary minus → Multiplication
        int ex4 = -(5 + 2) * 3;
        // Step 1: (5+2)=7
        // Step 2: -(7)=-7
        // Step 3: -7*3=-21
        System.out.println("Ex4: " + ex4); // Output: -21

        // Example 5: Modulo, Multiplication, then Addition (same precedence left→right)
        int ex5 = 17 % 5 + 2 * 3;
        // Step 1: 17%5=2
        // Step 2: 2*3=6
        // Step 3: 2+6=8
        System.out.println("Ex5: " + ex5); // Output: 8

        // Example 6: Arithmetic → Relational
        boolean ex6 = 10 + 2 > 5 * 2;
        // Step 1: 10+2=12, 5*2=10
        // Step 2: 12>10 → true
        System.out.println("Ex6: " + ex6); // Output: true

        // Example 7: Multiplication/Division → Equality → Assignment
        boolean ex7 = (3 * 3) == (20 / 2);
        // Step 1: (3*3)=9
        // Step 2: (20/2)=10
        // Step 3: 9==10 → false
        // Step 4: Assign → ex7=false
        System.out.println("Ex7: " + ex7); // Output: false

        // Example 8: && before ||
        boolean ex8 = true || false && false;
        // Step 1: false&&false=false
        // Step 2: true||false=true
        System.out.println("Ex8: " + ex8); // Output: true

        // Example 9: Parentheses → Relational → Equality → && → ||
        boolean ex9 = (4 + 6 > 5) && (8 - 3 == 5) || false;
        // Step 1: (4+6)=10, (8-3)=5
        // Step 2: 10>5=true, 5==5=true
        // Step 3: true&&true=true
        // Step 4: true||false=true
        System.out.println("Ex9: " + ex9); // Output: true

        // Example 10: Arithmetic → Assignment
        int a = 2;
        int b = 3;
        int ex10 = a + b * 4;
        // Step 1: b*4=12
        // Step 2: a+12=2+12=14
        // Step 3: Assign → ex10=14
        System.out.println("Ex10: " + ex10); // Output: 14
    }
}
