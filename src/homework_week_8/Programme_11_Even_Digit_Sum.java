package homework_week_8;

import java.util.Scanner;

public class Programme_11_Even_Digit_Sum {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s1.nextInt();
        getEvenDigitSum(num);
        s1.close();
    }

    public static void getEvenDigitSum(int number){
        int evenNumber=0;
        while(number>0){
            int digit  = number%10;
            if(digit%2==0){
                evenNumber +=digit;
            }
            number /=10;
        }
        System.out.println("The sum of even digit in number is : "+evenNumber);
    }
}
