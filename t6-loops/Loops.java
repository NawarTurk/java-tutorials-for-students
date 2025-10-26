// Loop Quick Examples – While, Do...While, and For
class Loops {
    public static void main(String[] args) {

        // Basic while loop
        int a = 0;
        while (a <= 6) {
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println();
        System.out.println(a);
        // Output: 
        // 0 2 4 6
        // 8

        // While countdown
        int b = 5;
        while (b > 0) {
            System.out.print(b + " ");
            b--;
        }
        System.out.println();
        // Output: 5 4 3 2 1

        // do...while executes at least once
        int c = 10;
        do {
            System.out.print(c + " ");
            c++;
        } while (c < 10);
        System.out.println();
        // Output: 10

        // for loop counting up
        for (int d = 1; d <= 5; d++) {
            System.out.print(d + " ");
        }
        System.out.println();
        // Output: 1 2 3 4 5

        // for loop counting down
        for (int e = 5; e >= 1; e--) {
            System.out.print(e + " ");
        }
        System.out.println();
        // Output: 5 4 3 2 1

        // for loop skipping by 3
        for (int f = 0; f <= 9; f += 3) {
            System.out.print(f + " ");
        }
        System.out.println();
        // Output: 0 3 6 9

        // for loop with break
        for (int g = 1; g <= 10; g++) {
            if (g == 4) break;
            System.out.print(g + " ");
        }
        System.out.println();
        // Output: 1 2 3

        // for loop with continue
        for (int h = 1; h <= 6; h++) {
            if (h == 3) continue;
            System.out.print(h + " ");
        }
        System.out.println();
        // Output: 1 2 4 5 6

        // for loop using char arithmetic
        for (int i = 0; i < 5; i++) {
            System.out.print((char)('a' + i) + " ");
        }
        System.out.println();
        // Output: a b c d e

        // Guess the output?
        int j = 2;
        for (int k = 1; k <= 3; k++) {
            j = 2 * j;
        }
        System.out.println(j);
        // Output: 16

        // do...while runs once even when condition false
        int z = 10;
        do {
            System.out.println("Runs once even though z > 5");
            z++;
        } while (z < 5);
        // Output:
        // Runs once even though z > 5


        // ❌ Common mistake; semicolon ends the loop immediately

        
        // int x = 0;
        // while (x < 3); {           // ← semicolon ends the loop (empty loop)
        //     System.out.println("Hello");
        //     x++;
        // }
        // Output:
        // Infinite loop (x never changes inside the while)

    }
}
