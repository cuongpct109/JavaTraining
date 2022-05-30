package fa.training.entities;

public class MathTeacher extends Teacher {
//Instance variables
	protected String mainSubject;
	
//Constructors
	public MathTeacher() {}
	public MathTeacher (String designation, String collegeName, String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}
//Instance methods
	public String getMainSubject() {
		return mainSubject;
	}
	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	
	public void teach(String content) {
		System.out.println(content);
	}
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + ", designation=" + designation + ", collegeName=" + collegeName + "]";
	}
}
