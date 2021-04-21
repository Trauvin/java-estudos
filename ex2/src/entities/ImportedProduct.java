package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomnsFee() {
		return customsFee;
	}

	public void setCustomnsFee(Double customnsFee) {
		this.customsFee = customnsFee;
	}
	
	@Override
	public final String priceTag() {
		return name + " $ " + totalPrice() + " (Custom Fee: $" + customsFee + ")";
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	
}
