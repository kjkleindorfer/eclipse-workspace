package model;

public class TemperatureConverter {
	private double temp;
	private double newTemp;
	public TemperatureConverter() {
		super();
	}
	
	public TemperatureConverter(double temp) {
		super();
		this.temp = temp;
		setNewTemp(temp);
	}
	
	public double getTemp() {
		return temp;
	}

	public double getNewTemp() {
		return newTemp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		setNewTemp(temp);
	}
	
	public void setNewTemp(double temp) {
		newTemp = (temp-32)*(5.0/9.0);
	}
	
	@Override
	public String toString() {
		return "deez";
	}
}
