/**
 * 
 */
package sEdwardsExercise8;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author Shane Edwards 
 *  
 *         Due Date: 12/4/2022
 *         
 *         This program creates a list of 52 traditional playing cards, then randomly 
 *         draws two and compares to see if they are a match or not.
 *         
 *         This is completely my own work with the following exceptions: NONE
 *
 */
public class SEdwardsExercise8 {

	/**
	 * @param args
	 */
	public SEdwardsExercise8() {
		
	}
	public static void main(String[] args) {
		ArrayList<PlayingCards>cards = new ArrayList<>();
		char [] suits = {'S', 'D', 'H', 'C'};
		for (int value = 2; value <= 14; value++) {
			for(char suit : suits) {
				PlayingCards card = new PlayingCards(suit, value);
				cards.add(card);
			}
		}
		Random dealer = new Random();
		PlayingCards card1 = cards.get(dealer.nextInt(cards.size()));
		PlayingCards card2 = cards.get(dealer.nextInt(cards.size()));
		System.out.println(card1 + "and " + card2 + (card1.isMatch(card2) ? "match" : "do not match"));
	}
}

	