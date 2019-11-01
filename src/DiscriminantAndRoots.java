import java.util.Scanner;

public class DiscriminantAndRoots {

    public static String roots(int a, int b, int c) {

        double root = Math.pow(b, 2) - (4 * (a * c));

        if (root > 0) {

            return a+"x^2 + " + b+ "x + " + c + " has 2 real roots";
        }
         else if (root < 0) {

            return a+"x^2 + " + b+ "x + " + c + " has 2 imaginary roots";
        }
         else {

            return a+"x^2 + " + b+ "x + " + c + " has 1 real root";
        }


    }

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please input the coefficient of a: ");
        int coefficient_a= user_input.nextInt();

        System.out.println("Please input the coefficient of b: ");
        int coefficient_b= user_input.nextInt();

        System.out.println("Please input the coefficient of c: ");
        int coefficient_c= user_input.nextInt();

        System.out.println(roots(coefficient_a,coefficient_b,coefficient_c));

    }

}
