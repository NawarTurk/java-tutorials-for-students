import java.util.Scanner;

class ScannerNewlineFlushDemo {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);

        // step 1: Read a full line
        System.out.print("Step 1) Enter a full line: ");
        String line1 = keyIn.nextLine(); // Reads entire line

        // step 2: Read an int (works fine after nextLine())
        System.out.print("Step 2) Enter an integer: ");
        int a = keyIn.nextInt();         // Reads the int, leaves '\n' behind
        keyIn.nextLine();                // CLEAR leftover newline after nextInt()

        // step 3: Read another full line
        System.out.print("Step 3) Enter another full line: ");
        String line2 = keyIn.nextLine(); // Works properly

        // step 4: Another int
        System.out.print("Step 4) Enter another integer: ");
        int b = keyIn.nextInt();         // Reads int (OK after a nextLine), leaves '\n'
        keyIn.nextLine();                // CLEAR leftover newline after nextInt()

        // step 5: Final line
        System.out.print("Step 5) Enter a final full line: ");
        String line3 = keyIn.nextLine();

        // Output
        System.out.println("\n--- Captured Inputs ---");
        System.out.println("Line 1: " + line1);
        System.out.println("Int 1: " + a);
        System.out.println("Line 2: " + line2);
        System.out.println("Int 2: " + b);
        System.out.println("Line 3: " + line3);

        keyIn.close();
    }
}
