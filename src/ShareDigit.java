
public class ShareDigit {

    private static Boolean true_digit (int num1, int num2) {

        if (num1==num2/10) {

            return true;
        }

        else if (num1%0==num2%10) {

            return true;
        }
        else if (num1/10==num2/10) {

            return true;
        }

        else {

            return false;
        }

        }


    public static void main(String[]args) {

        true_digit(12,23);
        true_digit(12,43);
        true_digit(12,44);

    }
}
