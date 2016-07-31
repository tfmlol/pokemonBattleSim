import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
// importing from AWT library which is an older library that was used prior to swing
// AWT can be used with any OS but because it uses the OS default designs, application styles were not consistent acrss various OS
// therefore, swing was invented to use AWT to call for an area on the OS to draw, then swing takes over and uses it's styling capabilities
// to ensure that style is consistent across OS
// Swing basicaly is written over top of AWT

//import javax.swing.Box;
//import javax.swing.BoxLayout;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//no longer needed to import swing libraries indiviually because I decided to call them all

import javax.swing.*;

public class RockPaperScissorGUI extends JFrame {

	public static void main(String[] args) {
		
//		JPanel pnl = new JPanel();
//		// Creating a panel
//		ImageIcon charmanderFront = new ImageIcon("src/Images/charFront.png");
//		// Initializing Images by assigning them variables
//		
//		// Creating an object and passing an image to the object
//		 JButton charFront = new JButton(charmanderFront);
		
		JFrame frame = new JFrame("projectPokemon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// terminates the program when the GUI is closed so it doesn't run forever
		
		JLabel playerChoiceLabel = new JLabel("", JLabel.CENTER);
		// Label that displays your choice if rock
		JLabel computerChoiceLabel = new JLabel("", JLabel.CENTER);
		// Label that displays the computer choice if scissors
		JLabel outcomeLabel = new JLabel("Pick your Pokemon!", JLabel.CENTER);
		// Top Label that hasn't been assigned to anything yet
		
		JButton bulbasaurButton = new JButton("Bulbasaur");
		JButton charmanderButton = new JButton("Charmander");
		JButton squirtleButton = new JButton("Squirtle");
		JButton iceButton = new JButton("Ice");
		JButton rockButton = new JButton("Rock");
		// creating buttons for selections using JButtons
		
		JLabel winsLabel = new JLabel("Wins: 0", JLabel.CENTER);
		JLabel lossesLabel = new JLabel("Losses: 0", JLabel.CENTER);
		JLabel tiesLabel = new JLabel("Ties: 0", JLabel.CENTER);
		// Creating Labels to display our scoreboard onto the panel
		
		ActionListener listener = new RockPaperScissorsListener(
				bulbasaurButton, 
				charmanderButton, 
				squirtleButton,
				iceButton,
				rockButton,
				playerChoiceLabel,
				computerChoiceLabel,
				outcomeLabel,
				winsLabel,
				lossesLabel,
				tiesLabel
				);
		// creates the listener in our main and passes the buttons over
		
		bulbasaurButton.addActionListener(listener);
		charmanderButton.addActionListener(listener);
		squirtleButton.addActionListener(listener);
		iceButton.addActionListener(listener);
		rockButton.addActionListener(listener);
		// assigns the buttons being passed to each individual button selection so we know which button is which
		
		// This is going to be our Top Panel
		JPanel singleGameOutcomePanel = new JPanel();
		singleGameOutcomePanel.setLayout(new BorderLayout());
		// Displaying the outcome of our game using the BorderLayout library
		
		singleGameOutcomePanel.add(playerChoiceLabel, BorderLayout.WEST);
		// calls the playerChoiceLabel1 label and places it onto our panel by calling our borderLayout library and places it in the western quadrant
		singleGameOutcomePanel.add(computerChoiceLabel, BorderLayout.EAST);
		// calls the computerChoiceLabel1 label and places it onto our panel by calling our borderLayout library and places it in the eastern quadrant
		singleGameOutcomePanel.add(outcomeLabel, BorderLayout.SOUTH);
		// calls the outcomeLabel1 label and places it onto our panel by calling our borderLayout library and places it in the southern quadrant
		
		// This is going to be our Middle Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		// Creating a panel for the buttons using the BoxLayout Library
		
		buttonPanel.add(Box.createGlue());
		buttonPanel.add(bulbasaurButton);
		buttonPanel.add(Box.createGlue());
		buttonPanel.add(charmanderButton);
		buttonPanel.add(Box.createGlue());
		buttonPanel.add(squirtleButton);
		buttonPanel.add(Box.createGlue());
		buttonPanel.add(iceButton);
		buttonPanel.add(Box.createGlue());
		buttonPanel.add(rockButton);
		// adding the selection buttons to the buttonPanel
		// What does Box.createGlue() do?
		
		// This is going to be our Bottom Panel
		JPanel totalsPanel = new JPanel();
		totalsPanel.setLayout(new FlowLayout());
		// Creating our scoreboard and setting the layout with the FlowLayout library
		
		totalsPanel.add(winsLabel);
		totalsPanel.add(lossesLabel);
		totalsPanel.add(tiesLabel);
		// adding our labels to the JPanel to display our score onto the GUI
		
		frame.setLayout(new BorderLayout());
		
		frame.add(singleGameOutcomePanel, BorderLayout.NORTH);
		// calls the singleGameOutcomePanel label and places our panel by calling our borderLayout library and places it up north
		frame.add(buttonPanel, BorderLayout.CENTER);
		// calls the buttonPanel and places our buttons and places it in the center
		frame.add(totalsPanel, BorderLayout.SOUTH);
		// calls the totalsPanel and places our scoreboard in the southern quadrant of the GUI
		
//		pnl.add(charFront);
		frame.setSize(500, 300);
		frame.setVisible(true);
		// sets the size of the window(Width, Height in pixels) and makes it visible
	}

}
