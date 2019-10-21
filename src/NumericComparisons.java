import java.util.Scanner;

public class NumericComparisons {


    public static boolean is_Odd(int num) {
        return num % 2 != 0;

    }

    public static boolean is_Even(int num) {
        return num % 2 != 1 ;

    }

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please enter the number you would like to be determined as either Odd or even: ");
        int num = user_input.nextInt();

        is_Odd(num);

        System.out.println(num + "is odd:" + is_Odd(num));


    }

}
