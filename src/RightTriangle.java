import java.util.Scanner;

public class RightTriangle {
    public static String isTriangle(int a,int b,int c) {

        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2)) {

            return "The side lengths of "+a+", "+b+", and " + c + " form a right triangle";
        }

        else if (a+c<b && b+c<a && a+b<c) {
            return "The side lengths of "+a+", "+b+", and " + c + " do not form a triangle";
        }
        else if(a+c>b && b+c>a && a+b>c) {

            return "The side lengths of "+a+", "+b+", and " + c + " form a triangle, but it is not a right triangle";

        }
        else
            return null;
    }

   /* public static String isRight(int a, int b, int c) {

        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2)) {

            return "The side lengths of "+a+", "+b+", and " + c + " form a right triangle";
        }

        else
            return null;



    }*/

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Enter three integer sides of a triangle: ");
        int a = user_input.nextInt();
        int b = user_input.nextInt();
        int c = user_input.nextInt();

    }

}
