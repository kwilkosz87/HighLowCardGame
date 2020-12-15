package HighLowGame;

import java.util.Arrays;

public class Hand {
	
	public int count1 = 0;
	private Card[] Hand;
	
	public Hand() 
	{
		Hand = new Card[52];
	}
	public void add(Card card)
	{
		Hand[count1++] = card;
	}
	public Card getTopCard()
	{
		return Hand[0];
	}
	public int value() 
	{
		int sum = 0;
		int rank = 0;
		int count2 = count1;
		for (int i = 0; i < count2; i++)
		{
			rank = Hand[i].value();
			sum += rank;
		}
		return  sum;
	}
	
	
}
