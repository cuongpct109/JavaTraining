package fa.training.methodoverloading;

public class TaxCollector {
	public static void main(String[] args) {
		BasicRateTax basicRateTax = new BasicRateTax();
		double grossIncome = Double.parseDouble(args[0]);
		double tax = basicRateTax.calcTax(grossIncome);
		System.out.println("Tax is " + tax);
	}
}
