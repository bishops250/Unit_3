import java.util.Scanner;
public class CookieOrders {

    public static String totalCost(int numBoxes) {
        double price_of_box;

        if (numBoxes>=1 && numBoxes<=4) {
            price_of_box=6.95;

            return "You bought "+numBoxes+" boxes of cookies at $"+price_of_box+" per box. Your  total bill is $"+
                    price_of_box*numBoxes;

        }
        else if  (numBoxes>=5 && numBoxes<=9) {
            price_of_box=5.95;

            return "You bought "+numBoxes+" boxes of cookies at $"+price_of_box+" per box. Your  total bill is $"+
                    price_of_box*numBoxes;

        }
        else if (numBoxes>=10 && numBoxes<=15) {
            price_of_box=5.50;

            return "You bought "+numBoxes+" boxes of cookies at $"+price_of_box+" per box. Your  total bill is $"+
                    price_of_box*numBoxes;

        }
        else if (numBoxes>=16) {
           price_of_box=4.95;

            return "You bought "+numBoxes+" boxes of cookies at $"+price_of_box+" per box. Your  total bill is $"+
                    price_of_box*numBoxes;

        }
        else
            return "The Character or number you Inputted is invalid";

    }

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("1-4 boxes:				6.95 per box\n"+
        "5-9 boxes:				5.95 per box\n"+
        "10-15 boxes:				5.50 per box\n"+
        "16 or more boxes:			4.95 per box\n");

        System.out.println("Enter the number of boxes you wish to purchase: ");
        int numBoxes = user_input.nextInt();

    }

}
