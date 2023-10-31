package homework_week_8;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 */
public class Programme_1_Reading_User_Input_Challange {

    //main method
    public static void main(String[] args) {

        System.out.println("Please enter the Numbers :");

        sumOfNumber();
    }

    //method to calculate sum of numbers
    public static void sumOfNumber(){
        //Scanner declaration for reading input from console
        Scanner s1 = new Scanner(System.in);

        int a=1;
        int sum=0;
        boolean t =true;
        boolean f=false;

        while(a<=10){
            System.out.println("#"+a+" : ");
            sum += s1.nextInt();
            a++;

            sum = sum+a;
        }
        System.out.println("The sum of Entered Number is : "+sum);



//        s1.hasNextInt();
//        while(t!= s1.hasNextInt()){
//            System.out.println("Invalid Number "+a);
//        }



        //closing scanner
        s1.close();
    }

    }

