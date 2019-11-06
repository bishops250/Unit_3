import java.util.Scanner;

public class RightTriangle {
    public static Boolean isTriangle(int a,int b,int c) {

        if (a + c < b && b + c < a && a + b < c) {
            return false;
        }
        else if (a + c > b && b + c > a && a + b > c) {

            return true;
        }
        else return false;
    }



    public static Boolean isRight(int a, int b, int c) {

        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))

            return true;

        else return false;

    }

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Enter three integer sides of a triangle: ");
        int a = user_input.nextInt();
        int b = user_input.nextInt();
        int c = user_input.nextInt();

    }

}
