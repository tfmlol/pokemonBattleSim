import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
// importing eventListeners and JButtons for the GUI to understand how to interact with user

/*
 * ASK KARIM HOW TO ADD NUMBER LINES AND CHANGE TEXT EDITOR COLOR SCHEME
 * THIS BRIGHT WHITE IS HURTING MY EYES!!!!!!
 * 
 * 
 * EVERYTIME you are adding a GUI objects/components to the screen
 * 1) Initialize them by assigning them to a variable
 * 2) Create them
 * 3) Display them to the screen
 * */

public class RockPaperScissorsListener implements ActionListener {
	RockPaperScissorModel model;
	// passing the RockPaperScissorModel over
	
	JLabel playerChoice;
	JLabel computerChoice;
	JLabel outcomeLabel;
	JLabel winsLabel;
	JLabel lossesLabel;
	JLabel tiesLabel;
	// passing the labels over
	

// this method is to listen for our buttons to be selected	
	JButton bulbasaurButton;
	JButton charmanderButton;
	JButton squirtleButton;
	// declaring buttons
	

	public RockPaperScissorsListener(
			JButton bulbasaurButton, 
			JButton charmanderButton, 
			JButton squirtleButton,
			JLabel playerChoiceLabel,
			JLabel computerChoiceLabel,
			JLabel outcomeLabel, 
			JLabel winsLabel,
			JLabel lossesLabel,
			JLabel tiesLabel){
	// Passing variables to our constructor so we can construct these buttons
		this.model = new RockPaperScissorModel();
		// assigning the RockPaperScissorModel() method to model to create a new object
		
		this.bulbasaurButton = bulbasaurButton;
		this.charmanderButton = charmanderButton;
		this.squirtleButton = squirtleButton;
		// assigning the passed button variables to their corresponding buttons
		
		this.playerChoice = playerChoiceLabel;
		this.computerChoice = computerChoiceLabel;
		this.outcomeLabel = outcomeLabel;
		this.winsLabel = winsLabel;
		this.lossesLabel = lossesLabel;
		this.tiesLabel = tiesLabel;
		// assigning the passed labels variables to their corresponding labels
	}
	
	public void actionPerformed(ActionEvent e) {
	// this method is to decide what to do once our listener picks up a method	
		String playerChoice;
		
		if(e.getSource() == bulbasaurButton){
			playerChoice = "Bulbasaur";
		} else if(e.getSource() == charmanderButton) {
			playerChoice = "Charmander";
		} else if(e.getSource() == squirtleButton) {
			playerChoice = "Squirtle";
		} else {
			playerChoice = "SOMETHING IS WRONG!!!";
		// check for errors
		}
		String computerChoice = model.getRandomChoice();
		// using the model to get a random choice
		
		System.out.println("You chose: " + playerChoice + "!");
		System.out.println("CPU chose: " + computerChoice + "!");
		// displaying the selections to console
		
		RockPaperScissorModel.GameOutcome outcome = model.getGameOutcome(playerChoice, computerChoice);
		if(outcome == RockPaperScissorModel.GameOutcome.WIN){
			System.out.println("Victory!!!");
		// if outcome matches the WIN variable conditions, then output VICTORY!!!	
		} else if(outcome == RockPaperScissorModel.GameOutcome.LOSE){
			System.out.println("Defeat!!!");
		// if outcome matches the LOSE variable conditions, then output DEFEAT!!!
		} else{
			System.out.println("It's a Draw! Try again");
		}
		
		winsLabel.setText("Wins: " + model.getWins());
		lossesLabel.setText("Losses: " + model.getLosses());
		tiesLabel.setText("Ties: " + model.getTies());
		
	}
	
}
