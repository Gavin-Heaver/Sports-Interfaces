/*
 * Gavin Heaver
 * Assignment 7: Interfaces
 * COP 3330
 * November 10, 2024
 */

public interface Sports extends Comparable<Sports>{
	//Create all methods
	public void score_large();
	public void score_med();
	public void score_small();
	public int get_score();
	public int get_id();
	public String toString();
}
