package homework_week_8;

import java.util.Scanner;

public class Programme_5_Palindrome_Number {

    public static void isPalindrome(int number) {
        int reverse = 0;
        int sum = 0;
        boolean a = true;
        boolean b = false;
        int orignalnumber = number;

        while (number > 0) {
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        if (orignalnumber == sum) {
            System.out.println(a+" is palindrome");
        }
        else{
            System.out.println(b+" is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1= s1.nextInt();

        isPalindrome(num1);
        s1.close();
    }
}
