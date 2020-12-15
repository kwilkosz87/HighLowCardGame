package HighLowGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
	
	private Card[] DeckArray = new Card[52];
	private int index1 = 0;
	
	public DeckOfCards()
	{
		int index2 = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0;  j < 13; j++)
			{
				Card a = new Card(i,j);
				DeckArray[index2] = a;
				index2++;
			}
	}
	
	public void shuffle()
	{
		index1 = 0;
		int counter = 0;
		while (counter < 100)
		{
			Random rand = new Random();
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			Card stored = DeckArray[x];
			DeckArray[x] = DeckArray[y];
			DeckArray[y] = stored;
			counter++;
		}
		
	}
	
	public boolean hasNextCard()
	{
		return index1<52;
	}
	
	public Card nextCard()
	{
		if (index1 < 52)
		{
			index1++;
			return DeckArray [index1 - 1];
		}
		else
		{
			return null;
		}
	}
	
	

}
