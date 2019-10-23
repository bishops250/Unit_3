import java.util.Scanner;

public class FindLargest {

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter your first number");
        int num1= user_input.nextInt();

        System.out.println(" Please enter your second number");
        int num2= user_input.nextInt();

        if (num1==num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        }

        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        }

        if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        }




    }
}
