package homework_week_8;

import java.util.Scanner;

public class Programme_2_Min_And_Max_Input_Challange {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int min= Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        while(true){
            System.out.println("Enter a number : ");
            if(!s1.hasNextInt()){
                break;
            }
            int number = s1.nextInt();
            if(number>max){
                max=number;
            }
        }
        System.out.println("Minimum number : "+min);
        System.out.println("Maximum number : "+max);
    }
}
