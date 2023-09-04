package sEdwardsExercise8;

public class PlayingCards {
    
	private char suit;
	private int value;

public PlayingCards(char suit, int value) {
	
	this.suit = suit;
	this.value = value;
}
public char getSuit() {
	return suit;
}
public void getSuit(char suit) {
	this.suit = suit;
}
public int getValue() {
	return value;
}
public void getValue(int value) {
	this.value = value;
}
public String toString( ) {
	char suit = getSuit();
	int value = getValue();
	String card = "";
	if(value == 11) {
		card += "(" + "J, " + suit + ")";
	}else if (value == 12) {
		card += "(" + "Q, " + suit + ")";
	}else if (value == 13) {
		card += "(" + "K, " + suit + ")";
	}else if (value == 14) {
		card += "(" + "A, " + suit + ")";
	}else {
		card = "(" + value + "," + suit + ")";
	}
	return card;
	}
public boolean isMatch(PlayingCards p) {
	if(this.getSuit() == p.getSuit() || this.getValue() == p.getValue())
		return true;
	else {
		return false;
	}
}
}
 