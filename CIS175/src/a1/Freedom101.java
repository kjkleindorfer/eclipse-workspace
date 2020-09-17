package a1;
import java.util.*;

//Noah H
public class Freedom101 {
	private static String testName = "";
	private int numScores = 0;
	private static ArrayList<Integer> scores = new ArrayList<Integer>();
	private static ArrayList<Character> grades = new ArrayList<Character>();
	
	public void printScores() {
		setLetterGrades();
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

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		Freedom101.scores = scores;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		Freedom101.testName = testName;
	}

	public int getNumScores() {
		return numScores;
	}

	public void setNumScores(int numScores) {
		this.numScores = numScores;
	}
}
