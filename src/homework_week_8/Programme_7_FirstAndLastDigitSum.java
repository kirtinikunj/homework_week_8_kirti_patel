package homework_week_8;

import java.util.Scanner;

public class Programme_7_FirstAndLastDigitSum {

    public static void sumFirstAndLastDigit(int number){
        int firstnumber = number;
        while(firstnumber>=10){
            firstnumber=firstnumber/10;
        }
        int lastnumber = number%10;
        int sum = firstnumber+lastnumber;
        System.out.println("The sum of first and last digit of "+number+" is : "+sum);
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s1.nextInt();
        sumFirstAndLastDigit(num);
        s1.close();
    }
}
