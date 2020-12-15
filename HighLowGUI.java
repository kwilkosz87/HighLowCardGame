package HighLowGame;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HighLowGUI extends JFrame {
	
	private Container contentPane;
	private JPanel buttonPanel = new JPanel();
	private JButton playButton = new JButton("Play  ");
	private JButton higherButton = new JButton ("Higher");
	private JButton lowerButton = new JButton ("Lower");
	private JLabel firstCard = new JLabel();
	private JLabel secondCard = new JLabel();
	private JTextArea outcomeArea = new JTextArea();
	
	public HighLowGUI() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		setSize(new Dimension(600 ,400));
		setTitle("High Low Card Game");
		
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.add(playButton);
		buttonPanel.add(higherButton);
		buttonPanel.add(lowerButton);
		contentPane.add(firstCard, BorderLayout.WEST);
		contentPane.add(secondCard, BorderLayout.EAST);
		contentPane.add(outcomeArea, BorderLayout.SOUTH);
		higherButton.setEnabled(false);
		lowerButton.setEnabled(false);
		firstCard.setText("    ");
		secondCard.setText("    ");
		int width = getWidth();
		int height = getHeight();
		firstCard.setPreferredSize(new Dimension(width/2-80, height-20));
		secondCard.setPreferredSize(new Dimension(width/2-80, height-20));
		outcomeArea.setPreferredSize(new Dimension(width-20, height - 380));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	

	

	public void setPlayAction(ActionListener listener) {
		playButton.addActionListener(listener);
		
	}
	
	public void setLowerAction(ActionListener listener) {
		lowerButton.addActionListener(listener);
	}

	public void setHigherAction(ActionListener listener) {
		higherButton.addActionListener(listener);
	}
	
	public void displayFirstCard(Hand hand) {
		firstCard.setText("First Card:\n" + hand.value() +"\n");
	}
	
	public void displaySecondCard(Hand hand) {
		secondCard.setText("Second Card:\n" + hand.value() + "\n");
	}
	
	public void displayOutcome(String outcome) {
		outcomeArea.setText(outcome);
	}
	
	public void enableLowerAndHigherButtons() {
		playButton.setEnabled(false);
		higherButton.setEnabled(true);
		lowerButton.setEnabled(true);
	}
	
	public void enablePlayButton() {
		playButton.setEnabled(true);
		higherButton.setEnabled(false);
		lowerButton.setEnabled(false);
		
	}
	


	static public void main(String[] args) {
		new HighLowGUI();
	}





	
}