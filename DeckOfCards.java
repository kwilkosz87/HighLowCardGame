package HighLowGame;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
	
	private ArrayList<Card> deck;
	//private Image backOfCardImage;

	/**
	 * One argument constructor
	 * @param deck
	 */
	public DeckOfCards(ArrayList<Card> deck) {
		this.deck = deck;
	}
	
	/**
	 * Default Constructor
	 */
	public DeckOfCards()
	{
		List<String> suits = Card.getValidSuits();
		List<String> names = Card.getValidNames();
		
		deck = new ArrayList<>();
		
		for (String suit:suits)
		{
			for (String name:names)
			deck.add(new Card(name, suit));
		}
	}
	
	

}
