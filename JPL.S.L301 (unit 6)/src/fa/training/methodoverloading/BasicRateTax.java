package fa.training.methodoverloading;

public class BasicRateTax {
	private static final int FIXED_BASED_INCOME;
	static {
		FIXED_BASED_INCOME = 1000;
	}
	double calcTax() {
		return FIXED_BASED_INCOME*20/100;
	}
	double calcTax(double grossIncome) {
		if (grossIncome > FIXED_BASED_INCOME) {
			return grossIncome*20/100;
		} else {
			return FIXED_BASED_INCOME*20/100;
		}
	}
}
