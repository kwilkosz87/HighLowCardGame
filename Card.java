package HighLowGame;

import java.util.Arrays;
import java.util.List;

public class Card {
	private int name, suit;
	//private Image image;
	
	private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; 
	private static final String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public Card(int suit, int name)
	{
		this.suit = suit;
		this.name = name;
	}
	
	public int value() 
	{
		if (this.name < 13)
		{
			return name + 2;
		}
		else
		{
			return 0;
		}
	}
	
	public String toString()
	{
		return names[this.name] + " of " + suits[this.suit];
	}
}