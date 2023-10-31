package homework_week_8;

import java.util.Scanner;

public class Programme_12_Prime_Number {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s1.nextInt();

    primeNumberCheck(num);
        s1.close();
    }

    public static void primeNumberCheck(int number){
        int i=2;
        int count =0;
        while(i<=number/2){
            if(number%i ==0){
                count++;
                break;
            }
            i++;
        }

        if(count ==0){
            System.out.println(number+" is prime number");
        }
        else {
            System.out.println(number+" is not prime number");
        }
    }
}

