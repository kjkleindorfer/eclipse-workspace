package model;

public class TemperatureConverterC {
	private double temp;
	private double newTemp;
	public TemperatureConverterC() {
		super();
	}
	
	public TemperatureConverterC(double temp) {
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
		newTemp =(temp * (9.0 / 5.0)) + 32;
	}
	
	@Override
	public String toString() {
		return "deez";
	}
}
