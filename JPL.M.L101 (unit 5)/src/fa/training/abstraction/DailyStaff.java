package fa.training.abstraction;

import java.util.Scanner;

public class DailyStaff extends Employee {
	private static final int PRICE_PER_WORKDAY = 15;
	private double numberOfWorkdays;
		
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return numberOfWorkdays*PRICE_PER_WORKDAY;
	}

	public double getNumberOfWorkdays() {
		return numberOfWorkdays;
	}

	public void setNumberOfWorkdays(int numberOfWorkdays) {
		this.numberOfWorkdays = numberOfWorkdays;
	}
	
	protected void inputData(Scanner scanner) {
		super.inputData(scanner);
		System.out.println("Enter amount of workday: ");
		numberOfWorkdays = Double.parseDouble(scanner.nextLine());
		System.out.println("---------------------------");
	}
	
	protected void display() {
		super.display();
		System.out.print("\t" + "\t" + numberOfWorkdays + "\t" + this.calcSalary() + "\n");
	}
}
	

