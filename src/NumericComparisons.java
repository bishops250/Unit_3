import java.util.Scanner;

public class NumericComparisons {


    private static boolean is_Odd(int num) {
        return num % 2 != 0;

    }

    private static boolean is_Even(int num) {
        return num % 2 != 1 ;

    }

    private static boolean is_Positive(int num) {

        return num
    }

    private static boolean is_Negative(int num) {

        return num
    }

    private static boolean is_Zero(int num) {

        return num
    }

    private static boolean is_Non_Positive(int num) {

        return num
    }

    private static boolean is_Non_Negative(int num) {

        return num
    }

    private static boolean is_Factor(int num) {

        return num
    }

    private static boolean is_Multiple(int num) {

        return num
    }


    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please enter the number you would like to be determined as either Odd or even: ");
        int num = user_input.nextInt();

        System.out.println("Please enter the number you would like to find the multiples and factors of: ");
        int num2 = user_input.nextInt();

        is_Odd(num);

        System.out.println(num + "is odd:" + is_Odd(num));


    }

}
