package a1;
import java.util.*;

//Noah H
public class Freedom101 {
	private static String testName = "";
	private static int numScores = 0;
	private static ArrayList<Integer> scores = new ArrayList<Integer>();
	private static ArrayList<Character> grades = new ArrayList<Character>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of your test.");
		//Save Test's name and let them know what they input. I'm not going to do validation
		//For this as it's not included in the assignment details so.
		testName = (sc.nextLine());
		System.out.println("You entered: " + getTestName() + " as your test name.");
		
		//Save Number of scores and let them know what they input, going to not do validation
		//for same reason as above.
		System.out.println("Please enter the number of test scores.");
		numScores = sc.nextInt();
		System.out.println("You entered: " + numScores + " as the number of scores.");
		
		for(int i = 0; i < numScores; i++) {
			System.out.println("Please enter score #" + (i+1) + ".");
			getScores().add(i, sc.nextInt());
		}
		new Freedom101(testName, scores);
		printScores();	
			
		
	}
	
	private static void printScores() {
		System.out.println("Score -------- Grade");
		for(int i = 0; i < scores.size(); i++) {
			System.out.println("  " + scores.get(i) + "  --------   " + grades.get(i));
		}
	}
	
	public Freedom101() {

	}
	public Freedom101(String testName, ArrayList<Integer> scores) {
		this.setTestName(testName);
		this.setScores(scores);
		setLetterGrades();
	}

	private void setLetterGrades() {
		for(int i = 0; i < scores.size(); i++) {
			if(scores.get(i) >= 90) {
				grades.add(i, 'A');
			}else if(scores.get(i) >= 80) {
				grades.add(i, 'B');
			}else if(scores.get(i) >= 70) {
				grades.add(i, 'C');
			}else if(scores.get(i) >= 60) {
				grades.add(i, 'D');
			}else{
				grades.add(i, 'F');
			}
		}
	}

	public static ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		Freedom101.scores = scores;
	}

	public static String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		Freedom101.testName = testName;
	}
}
