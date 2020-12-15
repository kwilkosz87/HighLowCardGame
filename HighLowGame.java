package HighLowGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighLowGame {
	public Card card;
	public DeckOfCards deck;
	private int stack;
	private int higher = 0;
	private int lower = 0;
	class BetAction implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			deck = new DeckOfCards();
			
			
		
			
		}
		
	}

	public static void main(String[] args) {
		//Card a = new Card(0,0);
		//System.out.println(a);
		
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
		}
	}

}
