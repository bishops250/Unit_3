/* Aron Bishop
November 2, 2019
                                        ///Rock Paper Scissors Game///

Description: "Rock Paper Scissors Game is a program utilizing Java(JDK 12.02). The program prompts the user type
 either "rock","paper", or "scissors". User input is not case sensitive, but the program is spelling sensitive.
  The choice the user select will then play Rock Paper Scissor shoot against
 a computer. The computers options are completely random. The computer can choose...

 1 = rock
 2 = paper
 3 = scissors

 The program then lists the users choice and computers choice and decides a winner based on the rules of rock paper
 scissors.

 Rules:
 Rock beats Scissors
 Rock loses to Paper
 Scissors beats Paper



 */
import java.util.Scanner;

public class RockPaperScissors {

    public static String getUserChoice() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        String user_choice = user_input.next().toLowerCase();
        return user_choice;

    }

    public static String getComputerChoice() {
        String
        double random_chance=(int)Math.random()*3;
        String computer_choice;

        if(random_chance==1) {
            return computer_choice=("rock");
        }
        else if(random_chance==2) {
            return computer_choice=("scissors");
        }

        else {
            return computer_choice=("rock");
        }

    }

    public static String whoWins(String computer, String person) {

        if (getComputerChoice()==getUserChoice()) {
            return "You chose " + getComputerChoice()+".\n"+ "The computer chose " + getComputerChoice()+"\nYou Tied!";
        }
        else if (getUserChoice()=="rock" && getComputerChoice()=="scissors" ) {
            return "You chose " + getComputerChoice()+".\n"+ " The computer chose " + getComputerChoice()+ "\nYou win!";
        }
        else if(getComputerChoice()=="rock" && getUserChoice()=="scissors" ) {
            return "You chose " + getComputerChoice() + ".\n" + " The computer chose " + getComputerChoice() +
                    "\nThe computer win!";
        }

        else if(getUserChoice()=="paper" && getComputerChoice()=="scissors" ) {
                return "You chose " + getComputerChoice() + ".\n" + " The computer chose " + getComputerChoice() +
                        "\nThe computer wins!";
            }

            else if(getComputerChoice()=="paper" && getUserChoice()=="scissors" ) {
                return "You chose " + getComputerChoice() + ".\n" + " The computer chose " + getComputerChoice() +
                        "\nThe computer wins!";
            }

        else if(getUserChoice()=="paper" && getComputerChoice()== )
    }



    public static void main(String[] args) {



    }
}
