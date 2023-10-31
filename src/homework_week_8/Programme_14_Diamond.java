package homework_week_8;

import java.util.Scanner;

public class Programme_14_Diamond {

    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rowsNumber = s1.nextInt();
        diamondMethod(rowsNumber);
        s1.close();
    }

    public static void diamondMethod(int rows){
        int i;
        int j;
        int space = 1;
        space = rows-1;
        for(j=1;j<=rows;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space--;
            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for(j=1;j<=rows-1;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space++;
            for(i=1;i<=2*(rows - j)-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
