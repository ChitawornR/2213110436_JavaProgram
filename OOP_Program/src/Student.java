
public class Student {
	//attribute
	private String name;
	private int score;
	
	//method
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int Score) {
		score = Score;
	}
	public int getScaore() {
		return score;
	}
	public boolean checkScore() {
		return (score >= 0 && score <= 100)? true:false;
	}
	public boolean isPass() {
		return (score >= 50)?true:false;
	}

}
