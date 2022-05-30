package fa.training.entities;

public abstract class Teacher {
// Instance variables
	protected String designation;
	protected String collegeName;	
	
// Constructor
	public Teacher() {
		
	}
	public Teacher(String designation, String collegeName) {
		super();
		this.designation = designation;
		this.collegeName = collegeName;
	}

// Instance methods	
	public abstract void teach(String content);
	
// Getter and setter
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getcollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
