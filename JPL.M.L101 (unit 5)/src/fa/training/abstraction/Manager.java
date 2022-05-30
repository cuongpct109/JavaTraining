package fa.training.abstraction;

import java.util.Scanner;

public class Manager extends Employee {
	private double basicSalary;
	private double wage;
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return wage*basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	protected void inputData(Scanner scanner) {
		super.inputData(scanner);
		System.out.println("Enter basic salary: ");
		basicSalary = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter wage: ");
		wage = Double.parseDouble(scanner.nextLine());
		System.out.println("---------------------------");
	}
	
	protected void display() {
		super.display();
		System.out.print("\t" + basicSalary + "\t" + wage + "\t" + this.calcSalary() + "\n");
	}
}
	

