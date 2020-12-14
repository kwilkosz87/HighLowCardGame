package HighLowGame;

import java.util.Arrays;
import java.util.List;

public class Card {
	private String faceType, suit;
	//private Image image;

	public Card(String faceType, String suit) {
		super();
		setFaceType(faceType);
		setSuit(suit);
	}

	/**
	 * @return the faceType
	 */
	public String getFaceType() {
		return faceType;
	}
	
	/**
	 * This method returns a list of valid face types valid for Card objects
	 */
	
	public static List<String> getValidFaceTypes()
	{
		return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10",
							"jack", "queen", "king", "ace");
		
	}

	/**
	 * @param faceType the faceType to set
	 */
	public void setFaceType(String faceType) {
		List<String> validFaceTypes = getValidFaceTypes();
		faceType = faceType.toLowerCase();
		
		if (validFaceTypes.contains(faceType))
			this.faceType = faceType;
		else
			throw new IllegalArgumentException(faceType + " is not a valid face type, valid face types are"
					+ validFaceTypes);
	}

	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}
	
	public static List<String> getValidSuits()
	{
		return Arrays.asList("spades", "clubs", "hearts", "diamonds");
		
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		List<String> validSuits = getValidSuits();
		suit = suit.toLowerCase();
		
		if (validSuits.contains(suit))
			this.suit = suit;
		else
			throw new IllegalArgumentException(suit + " is not a valid suit, valid suits are"
					+ validSuits);
	}

	@Override
	public String toString() 
	{
		return String.format("%s of %s", faceType, suit);
	}

	
	
}
