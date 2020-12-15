package HighLowGame;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.awt.Image.*;
import javax.swing.*;
import java.util.*;



public class HighLowGame {
	public static final int WIN_STREAK = 0;
	public Hand firstCard;
	public Hand secondCard;
	public DeckOfCards deck;
	public HighLowGUI GUI;
	
	public HighLowGame ()
	{
		GUI = new HighLowGUI();
		GUI.setPlayAction(new PlayAction());
		GUI.setHigherAction(new HigherAction());
		GUI.setLowerAction(new LowerAction());
		GUI.enablePlayButton();
	}
	class PlayAction implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			Random rand = new Random();
			deck = new DeckOfCards();
			deck.shuffle();
			firstCard = new Hand();
			secondCard = new Hand();
			firstCard.add(DeckOfCards.nextCard());
			secondCard.add(DeckOfCards.nextCard());
			GUI.displayFirstCard(firstCard);
			GUI.enableLowerAndHigherButtons();
		}
	}	
	class HigherAction implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			GUI.displaySecondCard(secondCard);
			if(firstCard.value() < secondCard.value())
			{
				winGame();
			}
			else if(firstCard.value() == secondCard.value())
			{
				tieGame();
			}
			else 
			{
				loseGame();
			}
		}
	}
	class LowerAction implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			GUI.displaySecondCard(secondCard);
			if(firstCard.value() > secondCard.value())
			{
				winGame();
			}
			else if(firstCard.value() == secondCard.value())
			{
				tieGame();
			}
			else
			{
				loseGame();
			}
		}
	}
		private void loseGame() {
			
			GUI.displayOutcome("Sorry, you lose.");
			GUI.enablePlayButton();
		}

		private void tieGame() {
			// TODO Auto-generated method stub
			GUI.displayOutcome("You have tied, try again.");
			GUI.enablePlayButton();
		}

		private void winGame() {
			// TODO Auto-generated method stub
			GUI.displayOutcome("Congratulations, you won!!!");
			GUI.enablePlayButton();
		}
	


	public static void main(String[] args) {
		/**
		Card a = new Card(0,0);
		System.out.println(a);
		
		DeckOfCards a = new DeckOfCards();
		System.out.println(a.toString());
			while(a.hasNextCard())
			{
				System.out.println(a.nextCard());
			}
		a.shuffle();
		System.out.println(a.toString());
		int counter = 0;
		while(a.hasNextCard())
		{
			System.out.println(a.nextCard());
		}**/
		new HighLowGame();
		
	}
}

