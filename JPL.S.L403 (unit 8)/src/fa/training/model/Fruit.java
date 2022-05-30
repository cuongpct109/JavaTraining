package fa.training.model;

public class Fruit implements Comparable<Fruit> {
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit (String fruitName, String fruitDesc, int quantify) {
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantify;
	}
	
	public String getFruitName() {
		return fruitName;
	}



	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}



	public String getFruitDesc() {
		return fruitDesc;
	}



	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public int compareTo(Fruit compareFruit) {
		// TODO Auto-generated method stub
		int compareQuantity = compareFruit.getQuantity();
		return this.getQuantity() - compareQuantity;
	}
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitDesc=" + fruitDesc + ", quantity=" + quantity + "]";
	}
}
