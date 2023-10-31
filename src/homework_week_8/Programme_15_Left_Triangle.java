package homework_week_8;

import java.util.Scanner;

public class Programme_15_Left_Triangle {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rowsNumber =s1.nextInt();
        leftTriangle(rowsNumber);
        s1.close();
    }

    public static void leftTriangle(int rows){
        for(int j =1;j<=rows;j++){
            for(int i=1;i<=rows-j;i++){
                System.out.print(" ");
            }
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
