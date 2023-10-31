package homework_week_8;

import java.util.Scanner;

public class Programme_10_Armstrong_Number {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s1.nextInt();
        armstrongNumber(num);
        s1.close();
    }

    public static void armstrongNumber(int number){
        int orignalnumber;
        int remainder;
        int result = 0;
        orignalnumber = number;

        while(orignalnumber!=0){
            remainder =orignalnumber%10;
            result +=Math.pow(remainder,3);
            orignalnumber /=10;
        }
        if(result == number){
            System.out.println(number+" : is Armstrong Number");
        }
        else{
            System.out.println(number+" : is not Armstrong Number");
        }
    }
}
