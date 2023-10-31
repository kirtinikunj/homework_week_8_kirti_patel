package homework_week_8;

import java.util.Scanner;

public class Programme_13_Shared_Digit {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int num1 = s1.nextInt();
        int num2 = s1.nextInt();

        System.out.println(hasSharedDigit(num1,num2));
        s1.close();
    }
        public static boolean hasSharedDigit(int a,int b){
        int al=a/10;
        int ar=a%10;
        int bl=b/10;
        int br=b%10;
        if(al == bl || al==br || ar==bl || ar==br){
            return true;
        }
        else{
            return false;
        }
    }
}
