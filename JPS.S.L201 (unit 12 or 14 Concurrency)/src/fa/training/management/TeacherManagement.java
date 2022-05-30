package fa.training.management;

import fa.training.entities.*;

public class TeacherManagement {
	public static void main(String[] args) {
		MathTeacher teacher = new MathTeacher("Teacher", "FU", "Math");
		System.out.println(teacher);
		teacher.teach(teacher.getMainSubject());
	}
}
