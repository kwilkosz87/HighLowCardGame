package HighLowGame;

public class main {

	public static void main(String[] args) 
	{
		Card card1 = new Card("ace", "clubs");
		System.out.println(card1);
		
		//invalid card
		Card card2 = new Card("3", "hearts");
		System.out.println(card2);
		
		DeckOfCards deck = new DeckOfCards();
		System.out.println(deck);
	}

}
