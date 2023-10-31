package homework_week_8;

import java.util.Scanner;

public class Programme_3 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any alphabet : ");
        char alpha = s1.next().charAt(0);

        vowelMethod(alpha);
        s1.close();
    }

    public static void vowelMethod(char vowel){
        if(vowel == 'a' || vowel == 'e' || vowel =='i' || vowel=='o' || vowel=='u') {
            System.out.println("It is a vowel : " + vowel);
        }
        else{
            System.out.println("It is not a vowel : "+vowel);
        }
    }
}
