package a1;

import java.util.Scanner;

public class Freedom101Logic {
	static Freedom101 freedom = new Freedom101();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of your test.");
		//Save Test's name and let them know what they input. I'm not going to do validation
		//For this as it's not included in the assignment details so.
		freedom.setTestName(sc.nextLine());
		System.out.println("You entered: " + freedom.getTestName() + " as your test name.");
		
		//Save Number of scores and let them know what they input, going to not do validation
		//for same reason as above.
		System.out.println("Please enter the number of test scores.");
		freedom.setNumScores(sc.nextInt());
		System.out.println("You entered: " + freedom.getNumScores() + " as the number of scores.");
		
		for(int i = 0; i < freedom.getNumScores(); i++) {
			System.out.println("Please enter score #" + (i+1) + ".");
			freedom.getScores().add(i, sc.nextInt());
		}
		//new Freedom101(testName, scores);
		freedom.printScores();
			
		
	}
}
