import java.util.Scanner;

public class ArrayTutorial {
    public static void main(String[] args) {

        // 1. Different ways to create arrays
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[5];
        b[0] = 5; b[1] = 10; b[2] = 15; b[3] = 20; b[4] = 25;

        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) 
        {
            c[i] = i * 2;
        }

        Scanner sc = new Scanner(System.in);
        int[] d = new int[3];
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < d.length; i++) 
        {
            d[i] = sc.nextInt();
        }

        // 2. Accessing elements
        System.out.println("\nAccessing elements from array a:");
        System.out.println("First element: " + a[0]);
        System.out.println("Last element: " + a[a.length - 1]);
        System.out.println("Middle element: " + a[a.length / 2]);
        // System.out.println(a[5]); // ❌ Out of bounds

        int[] e = {1, 2, 3, 0};
        System.out.println("\nNested indexing:");
        System.out.println("e[e[2]] = " + e[e[2]]); // e[2]=3 → e[3]=0

        System.out.println("\nPrinting array b:");
        for (int i = 0; i < b.length; i++) 
        {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        // 3. 2D arrays
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] y = new int[3][3];
        y[0][0] = 1; y[0][1] = 2; y[0][2] = 3;
        y[1][0] = 4; y[1][1] = 5; y[1][2] = 6;
        y[2][0] = 7; y[2][1] = 8; y[2][2] = 9;

        System.out.println("\nEnter elements for a 2x3 array:");
        int[][] z = new int[2][3];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("z[" + i + "][" + j + "]: ");
                z[i][j] = sc.nextInt();
            }
        }

        // 4. Accessing rows and columns
        System.out.println("\nFirst row of x:");
        for (int j = 0; j < x[0].length; j++) 
        {
            System.out.println("x[0][" + j + "] = " + x[0][j]);
        }

        System.out.println("\nSecond row of x:");
        for (int j = 0; j < x[1].length; j++) 
        {
            System.out.println("x[1][" + j + "] = " + x[1][j]);
        }

        System.out.println("\nFirst column of x:");
        for (int i = 0; i < x.length; i++) 
        {
            System.out.println("x[" + i + "][0] = " + x[i][0]);
        }

        System.out.println("\nAll elements, row by row:");
        for (int i = 0; i < x.length; i++) 
        {
            for (int j = 0; j < x[i].length; j++) 
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Diagonals and middle
        System.out.println("\nMain diagonal:");
        for (int i = 0; i < x.length; i++) 
        {
            System.out.println("x[" + i + "][" + i + "] = " + x[i][i]);
        }

        System.out.println("\nSecondary diagonal:");
        for (int i = 0; i < x.length; i++) 
        {
            System.out.println("x[" + i + "][" + (x.length - 1 - i) + "] = " + x[i][x.length - 1 - i]);
        }

        if (x.length % 2 != 0)
        {
            System.out.println("\nMiddle element: " + x[x.length / 2][x.length / 2]);
        }

        sc.close();
    }
}
