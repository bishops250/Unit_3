import java.util.Scanner;

public class SlopeOfALine {

    public static String slope(int x1, int y1, int x2, int y2) {

        double slope = (y2 - y1) / (x2 - x1);

        if (x1 == x2) {
            return ("The line defined by the points" + "(" + x1 + "," + y1 + ") and" +
                    "(" + x2 + "," + y2 + ") is a vertical line and the slope is undefined.");
        } else {

            return "The line defined by the points" + "(" + x1 + "," + y1 + ") and" +
                    "(" + x2 + "," + y2 + ") has a slope of " + slope;
        }
    }

        public static void main (String[]args){

            Scanner user_input = new Scanner(System.in);

            System.out.println(" Please enter the first X coordinate: ");
            int x1 = user_input.nextInt();
            System.out.println(" Please enter the first Y coordinate: ");
            int y1 = user_input.nextInt();
            System.out.println(" Please enter the second X coordinate: ");
            int x2 = user_input.nextInt();
            System.out.println(" Please enter the second Y coordinate: ");
            int y2 = user_input.nextInt();

            slope(x1, y1, x2, y2);
        }
    }
