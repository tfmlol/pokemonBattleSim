import java.util.Scanner;
// importing Scanner library for userInputs 

public class Main {
	public static void main(String[] args){
	// our main method that checks to see if we can create a new instance of our model and output a single random choice	
		RockPaperScissorModel model = new RockPaperScissorModel(); {
			
			Scanner scanner = new Scanner(System.in);
			// creating a new scanner called scanner(soo creative)
			
			while(true){
			// puts the entire game into the loop so the game can be played multiple times until the user decides to not play anymore
			// this means we have to create a quit option
				
				System.out.println("Type ROCK, PAPER, or SCISSORS");
				String playerChoice = scanner.nextLine().toUpperCase();
				// allows the player to output a decision and converts all the characters to captial letters since we stored our options as capitals
				
				String computerChoice = model.getRandomChoice();
				// calling our method we assigned in our model for the computer selection option and assigning it a string var called computerChoice
				
				System.out.println("You choose: " + playerChoice);
				System.out.println("Coputer choose: " + computerChoice);
				// displays user choice and computer choice for comparison sake
				
				RockPaperScissorModel.GameOutcome outcome = model.getGameOutcome(playerChoice, computerChoice);
				// outputting the 3 different turnouts to the user for visually sake
				// model is already defined as a new object so I don't have to create a new model because we already defined it as new
				if (outcome == RockPaperScissorModel.GameOutcome.WIN){
					System.out.println("Victory!");
				// if WIN condition in the model is met, output Victory!	
				} else if(outcome == RockPaperScissorModel.GameOutcome.LOSE){
					System.out.println("Defeat!");
					// if LOSE condition in the model is met, output Defeat!	
				} else {
					System.out.println("it's a Draw!");
					// if TIE condition in the model is met, output it's a Draw!	
				}
				
				System.out.println("Wins: " + model.getWins());
				System.out.println("Losses: " + model.getLosses());
				System.out.println("Ties: " + model.getTies());
				// Creates the scoreboard by outputting it to the console
				
				System.out.println("Would you like to play again? (yes/no)");
				// ask the user if they'd like to play again
				
				String answer = scanner.nextLine();
				// creates a STRING scanner to acept the user input to play again or not
				if(answer.equalsIgnoreCase("no")){
					break;
				// if the users answer is equal to no, then hop out of the while loop 	
				}
			}	
			scanner.close();
			// closes the scanner so there cannot be any more inputs acepted
		}
	}
}
