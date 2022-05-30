package fa.training.abstraction;

import java.util.Scanner;

public class ProductionStaff extends Employee {
	private static final int PRICE_PER_PRODUCT = 20;
	private double amountOfProduct;
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return amountOfProduct*PRICE_PER_PRODUCT;
	}

	public double getAmountOfProduct() {
		return amountOfProduct;
	}

	public void setAmountOfProduct(int amountOfProduct) {
		this.amountOfProduct = amountOfProduct;
	}

	protected void inputData(Scanner scanner) {
		super.inputData(scanner);
		System.out.println("Enter amount of product: ");
		amountOfProduct = Double.parseDouble(scanner.nextLine());
		System.out.println("---------------------------");
	}
	
	protected void display() {
		super.display();
		System.out.print("\t" + "\t" + amountOfProduct + "\t" + this.calcSalary() + "\n");
	}
}
