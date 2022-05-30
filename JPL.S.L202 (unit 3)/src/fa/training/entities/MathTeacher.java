package fa.training.entities;

public class MathTeacher extends Teacher {
	
	protected String mainSubject;
	
	public String getMainSubject() {
		return mainSubject;
	}
	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	
	public MathTeacher () {}
	public MathTeacher(String designation, String collegeName, String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}
	
	
	public void teach(String content) {}
	public String toString() {
		return "something";
	}

}
