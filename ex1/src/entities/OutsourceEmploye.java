package entities;

public class OutsourceEmploye extends Employee {
	
	private Double aditionalCharge;

	public OutsourceEmploye() {
		super();
	}
	
	public OutsourceEmploye(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
		super(name, hours, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return aditionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}
	
	@Override
	public Double payment() {
//		aditionalCharge = aditionalCharge * 0.1 + aditionalCharge;
//		return hours * valuePerHour + aditionalCharge;
		return super.payment() + aditionalCharge * 1.1;
	}
	
	
}
