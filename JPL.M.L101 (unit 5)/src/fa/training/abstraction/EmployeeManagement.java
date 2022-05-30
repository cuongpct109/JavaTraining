package fa.training.abstraction;

import java.lang.reflect.Method;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Employee.setCompanyName("NAPA"); 
		ProductionStaff staff1 = new ProductionStaff();
		DailyStaff staff2 = new DailyStaff();
		Manager staff3 = new Manager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Employee 1");
		staff1.inputData(scanner);
		System.out.println("Employee 2");
		staff2.inputData(scanner);
		System.out.println("Employee 3");
		staff3.inputData(scanner);
		Employee[] employees = new Employee[3];
		employees[0] = staff1;
		employees[1] = staff2;
		employees[2] = staff3;
		
		for (Employee employee: employees) {
			employee.display();
		}
		
		scanner.close();
		
		}
		
	}

