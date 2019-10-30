
public class ShareDigit {

    public static Boolean numbers (int num1, int num2) {

        if (num1/10==num2/10) {

            return true;
        }

        else if (num1%10==num2%10) {

            return true;
        }
        else if (num1/10==num2%10) {

            return true;
        }

        else if (num1%10== num2/10) {

            return true;
        }

        else {
            return false;
        }

        }


    public static void main(String[]args) {

        numbers(12,23);
        numbers(12,43);
        numbers(12,44);

    }
}
