
public class RockPaperScissorModel {
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	// creating variables for the results so we can keep track of them and possibly make a GUI
	
	public static enum GameOutcome {
	// an enum is used because booleans can only output 2 possibilities whereas an enum can output 3 	
		WIN, LOSE, TIE;
	}
	
	public GameOutcome getGameOutcome(String userChoice, String computerChoice){
		// Create the win conditions
		// Win and loss conditions for Rock
		if (userChoice.equalsIgnoreCase("Bulbasaur")){
			if(computerChoice.equalsIgnoreCase("Charmander") || ("Ice")){
				// if user chooses rock and computer chooses paper
				losses++;	
				// increment the losses interger by 1
				return GameOutcome.LOSE;
			} else if (computerChoice.equalsIgnoreCase("Squirtle")){
				// if user chooses rock and computer chooses scissors
				wins++;
				// increment the wins interger by 1
				return GameOutcome.WIN;
			}
		}
		// Win and loss conditions for paper
		else if(userChoice.equalsIgnoreCase("Charmander")){
			if(computerChoice.equalsIgnoreCase("Squirtle")){
				// if user picks paper and computer picks scissors
				losses++;
				// increment the losses interger by 1
				return GameOutcome.LOSE;
			} else if(computerChoice.equalsIgnoreCase("Bulbasaur")) {
				// if user picks paper and computer picks rock
				wins++;
				// increment the wins interger by 1
				return GameOutcome.WIN;
			}
		}
		// Win and loss conditions for scissors
				else if(userChoice.equalsIgnoreCase("Squirtle")){
					if(computerChoice.equalsIgnoreCase("Bulbasaur")){
						// if user picks scissors and computer picks rocks
						losses++;
						// increment the losses interger by 1
						return GameOutcome.LOSE;
					} else if(computerChoice.equalsIgnoreCase("Charmander")) {
						// if user picks scissors and computer picks paper
						wins++;
						// increment the wins interger by 1
						return GameOutcome.WIN;
					}
				}
			// ice win conditions
					else if(userChoice.equalsIgnoreCase("Ice")){
						if(computerChoice.equalsIgnoreCase("Charmander")){
							// if user picks scissors and computer picks rocks
							losses++;
							// increment the losses interger by 1
							return GameOutcome.LOSE;
						} else if(computerChoice.equalsIgnoreCase("Bulbasaur")) {
							// if user picks scissors and computer picks paper
							wins++;
							// increment the wins interger by 1
							return GameOutcome.WIN;
						}
					}
		ties++;
		// increment the ties interger by 1
		return GameOutcome.TIE;
		// if none of the conditions above are met then the results have to be the same, therefore it's a tie
				
	}
	
	public String getRandomChoice(){
	// method for how comeputer selects its choice	
		double random = Math.random();
		// assigning a random generator to a double int
		// the Math.random method returns a value that ranges from 0-1 therefore we can abuse that to determine our computer logic
		
		if(random < .20){
			return "Bulbasaur";
		// if the random number returned is less than 0.33, computer will choose rock	
		} else if (random < .40){
			return "Charmander";
		// if the random number returned is less than 0.66, computer will choose paper	
		}else if (random < .60){
			return "Squirtle";
		// if the random number returned is less than 0.66, computer will choose paper	
		}else if (random < .80){
			return "Ice Type";
		// if the random number returned is less than 0.66, computer will choose paper	
		} else {
			return "Rock Type";
		// otherwise if the other 2 condidtions are not met, choose scissors (any number from 0.67 - 1)	
		}
	}
	
	public int getWins(){
		return wins;
	// creates a method call getWins that returns the wins value (i.e. score)	
	}
	public int getLosses(){
		return losses;
		// creates a method call getLosses that returns the wins value (i.e. score)	
	}
	public int getTies(){
		return ties;
		// creates a method call getTies that returns the wins value (i.e. score)	
	}
	
}
