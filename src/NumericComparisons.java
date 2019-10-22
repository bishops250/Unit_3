import java.util.Scanner;

public class NumericComparisons {


    private static boolean is_Odd(int num) {
        return num % 2 != 0;
    }

    private static boolean is_Even(int num) {
        return num % 2 == 0 ;

    }

    private static boolean is_Positive(int num) {

        return num >=0;
    }

    private static boolean is_Negative(int num) {

        return num <=0;
    }

    private static boolean is_Zero(int num) {

        return num == 0;
    }

    private static boolean is_Non_Positive(int num) {

        return num <=0;
    }

    private static boolean is_Non_Negative(int num) {

        return num >= 0;
    }

    private static boolean is_Factor(int num1, int num2) {

        return num1 % num2 == 0 ;
    }

    private static boolean is_Multiple(int num1, int num2) {

        return num2 % num1 == 0 ;
    }


    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please enter the number you would like to be determined as either Odd or even: ");
        int num = user_input.nextInt();

        System.out.println(num + " is Odd: " + is_Odd(num));
        System.out.println(num + " is Even: " + is_Even(num));
        System.out.println(num + " is Positive: " + is_Positive(num));
        System.out.println(num + " is Negative: " + is_Negative(num));
        System.out.println(num + " is Non-Negative: " + is_Non_Negative(num));
        System.out.println(num + " is Non-Positive: " + is_Non_Positive(num));
        System.out.println(num + " is Zero: " + is_Zero(num));


        System.out.println("Please enter the number you would like to multiples of ");
        int num2 = user_input.nextInt();

        System.out.println("Please enter the your guess of factor of the multiple: " + num2);
        int num3 = user_input.nextInt();




    }

}
