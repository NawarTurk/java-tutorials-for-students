public class ConditionalStatement {
    public static void main(String[] args) {
        // ----------------------------------------------------------
        // 1. Basic if-else
        if (true)                               // condition is true → enter if block
            System.out.println("S1");           // prints S1
        else
            System.out.println("S2");           // skipped
        System.out.println("S3");               // runs always
        // Output: S1, S3


        // ----------------------------------------------------------
        // 2. Using braces {}
        int x = 5;                              // x is positive
        if (x > 0) {                            // true → enter if block
            System.out.println("S1");           // prints S1
            System.out.println("S2");           // prints S2
        } else {
            System.out.println("S3");           // skipped
            System.out.println("S4");           // skipped
        }
        // Output: S1, S2

        if (x > 0)                              // true
            System.out.println("S1");           // prints S1 (only one statement in if)
        else
            System.out.println("S2");           // skipped
            System.out.println("S3");           // not part of else → always runs
        // Output: S1, S3


        // ----------------------------------------------------------
        // 3. Semicolon after if
        if (false);                             // semicolon ends if early (no body)
            System.out.println("S1");           // runs unconditionally
        System.out.println("S3");               // runs always
        // Output: S1, S3


        // ----------------------------------------------------------
        // 4. Dangling else (belongs to nearest if)
        int y = 5;
        if (x > 0)                              // true
            if (y > 10)                         // false
                System.out.println("S1");       // skipped
            else
                System.out.println("S2");       // runs (else matches inner if)
        System.out.println("S3");               // runs always
        // Output: S2, S3


        // ----------------------------------------------------------
        // 5. Dangling else (belongs to outer if because of braces)
        int a = 10, b = 5;
        if (a > 0) {                            // true
            if (b > 10)                         // false
                System.out.println("S1");       // skipped
        } else
            System.out.println("S2");           // skipped because a > 0
        System.out.println("S3");               // runs always
        // Output: S3


        // ----------------------------------------------------------
        // 6. if–if–else with outer if false
        int n = 3;
        if (n > 10)                             // false → skip entire block
            if (n > 20)                         // not checked
                System.out.println("S1");
            else
                System.out.println("S2");
        System.out.println("S3");               // runs always
        // Output: S3


        // ----------------------------------------------------------
        // 7. Lazy evaluation with &&
        int m = 5;
        if (false && (m + 100) > 0 && Math.sqrt(m) > 2)
            System.out.println("S1");           // skipped, left side false
        else
            System.out.println("S2");           // runs
        System.out.println("S3");               // runs
        // Output: S2, S3  (right side not evaluated)


        // ----------------------------------------------------------
        // 8. Lazy evaluation with ||
        int c = 5;
        if (true || (c + 100) < 0 || Math.pow(c, 2) > 10)
            System.out.println("S1");           // runs, left side true
        else
            System.out.println("S2");           // skipped
        System.out.println("S3");               // runs
        // Output: S1, S3  (right side not evaluated)


        // ----------------------------------------------------------
        // 9. Combined logic
        if (false || true && false)             // true && false → false; false || false → false
            System.out.println("S1");           // skipped
        else
            System.out.println("S2");           // runs
        System.out.println("S3");               // runs
        // Output: S2, S3


        // ----------------------------------------------------------
        // 10. Complex nested logic with && and ||
        int p = 3, q = 7;
        if ((p < 5 && q > 10) || (p < 10 && q < 8))
            System.out.println("S1");           // true because (p < 10 && q < 8)
        else
            System.out.println("S2");           // skipped
        System.out.println("S3");               // runs
        // Output: S1, S3


        // ----------------------------------------------------------
        // 11. Nested if with opposite outcomes
        int k = 8;
        if (k > 5) {                            // true → check inside
            if (k < 5)                          // false
                System.out.println("S1");       // skipped
            else
                System.out.println("S2");       // runs
        }
        System.out.println("S3");               // runs always
        // Output: S2, S3
    }
}
