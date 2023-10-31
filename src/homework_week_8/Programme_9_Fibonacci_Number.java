package homework_week_8;

import java.util.Scanner;

public class Programme_9_Fibonacci_Number {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int num = s1.nextInt();
        fibonacciSeries(num);
        s1.close();
    }

    public static void fibonacciSeries(int number){
        int t1=0;
        int t2=1;
        System.out.println("Fibonacii series till "+number+" terms : ");
        for(int i =1;i<=number;i++){
            System.out.print(t1+",");
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
