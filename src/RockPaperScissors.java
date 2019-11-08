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


    private static String getUserChoice() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        String answer_question = user_input.next();
        return answer_question.toLowerCase();

    }

    /* getComputerChoice(): Randomly Picks a Num between 1 and 3 inclusive, and then it assigns nums a option either
    the computer chooses "rock",", "paper", or "scissors"-options are not weighted unevenly. It Then returns the answer
    */

    public static String getComputerChoice() {
        double random_chance=(int)((Math.random()*3)+1);

        if(random_chance==1) {
            return "paper";
        }

        else if(random_chance==2) {
            return "scissors";
        }

        else {
            return "rock";
        }


    }
    /* whoWins() decides based on string equality or difference who is the winner or if their is a tie.
    The variables allow me to only have one return statement and not have to rewrite who wins multiple times.
     */
    public static String whoWins(String computer, String person) {
        String computer_wins = "\nThe computer wins!";
        String user_wins = "\nYou win!";
        String the_game_winner;


        if (computer.equals(person)) {  /*The User and Computer choose the same action.So it sets the Winner
        as a tie */
            the_game_winner =  "\nYou tied!";
        } else if (person.equals("rock") && computer.equals("scissors")) { /*User chooses Rock &
             Computer chooses Scissors, Winner = User*/
            the_game_winner = user_wins;
        } else if (computer.equals("rock") && person.equals("scissors")) {/*Computer chooses Rock &
             Person chooses Scissors, Winner = Computer */
            the_game_winner = computer_wins;
        } else if (person.equals("paper") && computer.equals("scissors")) {/*User chooses Paper &
             Computer chooses Scissors, Winner = computer*/
            the_game_winner = computer_wins;
        } else if (computer.equals("paper") && person.equals("scissors")) {/*Computer chooses Paper &
             Person chooses Scissors, Winner = User*/
            the_game_winner = user_wins;
        } else if (person.equals("rock") && computer.equals("paper")) {/*User chooses Rock &
             Computer chooses paper, Winner = Computer*/
            the_game_winner = computer_wins;
        } else if (computer.equals("rock") && person.equals("paper")) {/*Computer chooses Rock &
             Users chooses Paper, Winner = User*/
            the_game_winner = user_wins;
        } else {/*User chooses Rock & Computer chooses Scissors, Winner = User*/
            return "Invalid input";
        }

        return "You chose " + person + ".\n" + "The computer chose " + computer
                +"."+ the_game_winner;
    }



    public static void main(String[] args) {

       String user_choice= getUserChoice();
       String computer_choice = getComputerChoice();
       System.out.println(whoWins(computer_choice,user_choice));


    }
}
