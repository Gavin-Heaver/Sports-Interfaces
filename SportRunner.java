/*
 * Gavin Heaver
 * Assignment 7: Interfaces
 * COP 3330
 * November 10, 2024
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SportRunner {

	public static void main(String[] args) {
		//Create ArrayList for sports
		ArrayList<Sports> sportList = new ArrayList<Sports>();
		
		//Bring in Scanner
		Scanner scan = new Scanner(System.in);
		
		//Declare variables
		String fileName;
		int teamAmount;
		int teamID = 0;
		
		//Request the file name that you would like to open
		System.out.println("What is the name of the file you would like to open: ");
		fileName = scan.nextLine();
		
		try {
			Scanner fileInput = new Scanner(new File(fileName));
			//Scan in the number of teams
			teamAmount = fileInput.nextInt();
			
			//Make loop to split the sports correctly
			for(int i = 0; i < teamAmount; i++) {
				//Get the sport chosen
				String sportChoice = fileInput.next();
				
				//Make conditional to see if sport is basketball or football
				if(sportChoice.equals("Basketball")) {
					//Give the choice its teamID
					sportList.add(new Basketball(teamID));
				} else if (sportChoice.equals("Football")) {
					//Give the choice its teamID
					sportList.add(new Football(teamID));
				}
				//Increase the teamID by one
				teamID += 1;
			}
			
			//Get the amount of scores
			int scoreAmount = fileInput.nextInt();
			
			//Loop for all the score amounts
			for (int i = 0; i < scoreAmount; i++) {
				//Get the ID number and score from the file
				int fileIDNum = fileInput.nextInt();
				String score = fileInput.next();
				
				//Loop the size of the list
				for(Sports S: sportList) {
					if (fileIDNum == S.get_id()) {
						//Make conditional to see which score occurred
						if(score.equals("s")) {
							//Add small amount of points
							S.score_small();
						} else if(score.equals("m")) {
							//Add medium amount of points
							S.score_med();
						} else if(score.equals("l")) {
							//Add large amount of points
							S.score_large();
						}
					} else if (fileIDNum != S.get_id()) {
						//Do nothing
					}
				}
			}
			
			//Sort the array
			Collections.sort(sportList);
			
			//Print out the list
			for(Sports S: sportList) {
				System.out.println(S);
			}
				
			//Make loop to register each 
			fileInput.close();
			
		} catch (FileNotFoundException e) {
			//State that no file was opened
			System.out.println("No file was opened");		
		}
		
		//close the scanner
		scan.close();
		
	}

}
