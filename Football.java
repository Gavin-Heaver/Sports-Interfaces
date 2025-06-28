/*
 * Gavin Heaver
 * Assignment 7: Interfaces
 * COP 3330
 * November 10, 2024
 */

public class Football implements Sports{
	//Declare and initialize variables
	private int score;
	private int ID;
	int small = 1;
	int medium = 3;
	int large = 7;
	
	//Create constructor
	public Football(int ID) {
		this.score = 0;
		this.ID = ID;
	}
	
	
	@Override
	public void score_large() {
		//Add points to score
		this.score += large;		
	}

	@Override
	public void score_med() {
		//Add points to score
		this.score += medium;		
	}

	@Override
	public void score_small() {
		//Add points to score
		this.score += small;
	}

	@Override
	public int get_score() {
		//Return score
		return this.score;
	}

	@Override
	public int get_id() {
		//Return the ID
		return this.ID;
	}
	
	@Override
	public int compareTo(Sports o) {
		//Sort descending
		return (int)(o.get_score() - this.score);
	}
	
	//Return the ID and score
	public String toString() {
		//Return based on this pattern
		return this.ID + " - " + this.score;
	}
}
