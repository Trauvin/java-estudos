package entities;

public class LegalEntity extends Person {
	
	private Integer employeeNumber;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}


	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double calcTax() {
		if (employeeNumber < 10) {
			return annualIncome * 0.16;
		}
		return annualIncome * 0.14;
	}
	
	
	
}
