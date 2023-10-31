package homework_week_8;

import java.util.Scanner;

public class Programme_4_Digit_Sum_Challenge {

    public static void sumDigit(int number){
        int digit=0;
        int sum=0;
        if(number <10){
            System.out.println("Enter valid number");
        }
        while(number >0){
           digit = number%10;
           sum =sum+digit;
           number = number/10;
        }
        System.out.println("Sum of entered number is : "+sum);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num1 = s1.nextInt();

        sumDigit(num1);
        s1.close();
    }
}
