package HighLowGame;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
	private ArrayList<Card> deck;
		private Image backOfCardImage;
	
	/* 1. Define class
	 * 2. Define instance variables
	 * 3. Create constructor
	 * 4. Create get/set methods
	 * 5. Create custom methods
	 */
	
	/*
	 * This is a 1 argument cosntructor that passes in a collection
	 * of Card objects
	 * @param deck
	 */
	public DeckOfCards(ArrayList<Card> deck)
        {
            this.deck = deck;
        }
	 
        /*
         * This is a default constructor
        */
        public DeckOfCards()
        {
		List<String> suits = Card.getValidSuits(); //this is calling a static method
												   //so we do NOT need an instance of Card
												   //to call it
		List<String> faceTypes = Card.getValidFaceTypes();
		
		deck = new ArrayList<>();
		
		//loop to make one of each type of card by suit
		for (String suit:suits)
		{
			for (String faceType:faceTypes)
				deck.add(new Card(faceType, suit));
		}
	}

}
