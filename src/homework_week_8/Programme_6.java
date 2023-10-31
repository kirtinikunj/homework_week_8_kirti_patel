package homework_week_8;

import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int nRows = s1.nextInt();
        triangleMethod(nRows);
        s1.close();
    }

    public static void triangleMethod(int number) {

        for (int i = 1; i <= number; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
