package HighLowGame;

import java.util.Arrays;
import java.util.List;

public class Card {
	private String name, suit;
	//private Image image;
	
	public Card(String name, String suit)
	{
		setName(name);
		setSuit(suit);
		
	}

	public String getName() {
		return name;
	}
	
	/**
	 * Method returns a list of face names
	 */
	
	public static List<String> getValidNames()
	{
		return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen", "king","ace");
	}
	
	/**
	 * 
	 * @param name (2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
	 */
	public void setName(String name) {
		List<String> validName = getValidNames();
		name = name.toLowerCase();
		
		
		if (validName.contains(name))
			this.name = name;
		else
			throw new IllegalArgumentException(name + " is not a valid name. The valid names are " + validName);
	}

	public String getSuit() {
		return suit;
	}
	
	public static List<String> getValidSuits()
	{
		return Arrays.asList("hearts", "diamonds", "clubs", "spades");
	}

	/**
	 * 
	 * @param suit (Clubs, Spades, Hearts, Diamonds)
	 */
	public void setSuit(String suit) {
		List<String> validSuit = getValidSuits();
		suit = suit.toLowerCase();
		
		
		if (validSuit.contains(suit))
			this.suit = suit;
		else
			throw new IllegalArgumentException(suit + " is not a valid suit. The valid suits are " + validSuit);
	}
	

	public String toString()
	{
		return String.format("%s of %s", name, suit);
	}
	

}
