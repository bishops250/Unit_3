import java.util.Scanner;

public class AddToPositiveOrNegativeSum {

    public static void main(String[]args) {
        Scanner user_input = new Scanner(System.in);

        int sum_positive = 0 , sum_negative = 0, num;

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Please enter the number you would like to find the sum for: ");
                    num = user_input.nextInt();
                    if (num>0) {
                        sum_positive += num;
                    }
                    if (num<0) {
                        sum_negative += num;
                    }
                }
                
        System.out.println("The sum of the positive numbers are: " + sum_positive);
        System.out.println("The sum of the negative number are: " + sum_negative);

    }

}
