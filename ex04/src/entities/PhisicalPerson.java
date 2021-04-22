package entities;

public class PhisicalPerson extends Person{
	
	private Double healthCare;
	
	public PhisicalPerson() {
		super();
	}

	public PhisicalPerson(String name, Double annualIncome, Double healthCare) {
		super(name, annualIncome);
		this.healthCare = healthCare;
	}

	@Override
	public double calcTax() {
		
		if (annualIncome < 20000.00) {
			return (annualIncome * 0.15) - (healthCare * 0.5);
		}
		return (annualIncome * 0.25) - (healthCare * 0.5);
	}

	
}
