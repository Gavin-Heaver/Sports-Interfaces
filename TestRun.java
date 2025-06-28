import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestRun {
	public static void main(String[] args) {
		//Create ArrayList for sports
		ArrayList<Sports> sportList = new ArrayList<Sports>();
		
		sportList.add(new Basketball(50));
		sportList.add(new Basketball(27));
		sportList.add(new Football(32));
		sportList.add(new Basketball(49));
		sportList.add(new Football(100));
		sportList.add(new Football(323));
		
		for (Sports b : sportList) {
			if (b.get_id() == 49) {
				b.score_large();
			}
			if (b.get_id() == 32) {
				b.score_large();
			}
			if (b.get_id() == 49) {
				b.score_large();
			}
			System.out.println(b);
		}
		System.out.println();
		
		Collections.sort(sportList);
		
		for (Sports b : sportList)
			System.out.println(b);
	}

}
