// StringOpsMiniTour.java
// 7 small tutorials (substring, charAt, toUpperCase, toLowerCase, replace)
// + gotchas + escape-character examples — each preceded by a question;
// the code answers it; a short comment explains; another comment shows the exact output.
// Nawar Turk
// https://www.linkedin.com/in/nawart/

public class StringOperations {
    public static void main(String[] args) {

        // Q: How do I extract "World" from "Hello World" using substring?
        String s1 = "Hello World";
        System.out.println(s1.substring(6));        // starts at index 6 to the end
                                                    // Output: World

        // Q: How do I extract "Hello" from "Hello World" using substring with a range?
        System.out.println(s1.substring(0, 5));     // indices 0..4; end index is exclusive
                                                    // Output: Hello

        // Q: How do I get the second character of "Hello"?
        String s2 = "Hello";
        System.out.println(s2.charAt(1));           // 0-based index; 1 is 'e'
                                                    // Output: e

        // Q: How do I convert "Hello World" to uppercase?
        String s3 = "Hello World";
        System.out.println(s3.toUpperCase());       // returns a new string in upper case
                                                    // Output: HELLO WORLD

        // Q: How do I convert "Java ROCKS!" to lowercase?
        String s4 = "Java ROCKS!";
        System.out.println(s4.toLowerCase());       // returns a new string in lower case
                                                    // Output: java rocks!

        // Q: How do I replace every 'a' with 'o' in "banana"?
        String s5 = "banana";
        System.out.println(s5.replace('a', 'o'));   // character-for-character replacement
                                                    // Output: bonono

        // Q: How do I replace all "-" with "/" in a date string?
        String s6 = "2025-09-23";
        System.out.println(s6.replace("-", "/"));   // literal substring replacement
                                                    // Output: 2025/09/23


        // ---- GOTCHAS / TRICKS ----

        // Q: What does substring(1,1) return, and why is end exclusive?
        String g1 = "abc";
        System.out.println("'" + g1.substring(1, 1) + "'"); // begin == end gives an empty string
                                                            // Output: ''
        System.out.println(g1.substring(1));                // from index 1 to end
                                                            // Output: bc
        // Note: g1.substring(2,1) or g1.substring(0,4) would throw StringIndexOutOfBoundsException.

        // Q: Do string methods modify the original string?
        String g4 = "cat";
        String g4b = g4.replace('c', 'b');                  // returns a new string; original unchanged
        System.out.println("original: " + g4);              // Output: original: cat
        System.out.println("replaced: " + g4b);             // Output: replaced: bat


        // ---- ESCAPE CHARACTER EXAMPLES ----

        // Q: How do I put a double quote inside a Java string?
        String e1 = "He said, \"Hello\"";
        System.out.println(e1);                             // use \" to escape a quote inside a string
                                                            // Output: He said, "Hello"

        // Q: How do I print a backslash character?
        String e2 = "C:\\Users\\Admin\\Documents";
        System.out.println(e2);                             // backslash is escaped as \\ 
                                                            // Output: C:\Users\Admin\Documents

        // Q: How do I insert a newline and a tab in a single string?
        String e3 = "First line\n\tIndented on second line";
        System.out.println(e3);
        // Output:
        // First line
        //     Indented on second line

        // Q: How do I include single quotes and backslashes together?
        String e4 = "It\'s a backslash: \\";
        System.out.println(e4);                             // \' for single quote (optional in strings), \\ for backslash
                                                            // Output: It's a backslash: \

        // Q: How do I show a literal \n and not create a newline?
        String e5 = "Show literal \\n not a newline";
        System.out.println(e5);                             // escape the backslash so \n is printed literally
                                                            // Output: Show literal \n not a newline
    }
}
