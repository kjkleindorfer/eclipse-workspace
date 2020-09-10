package model;

public class CarDealership {
	private String brand;
	private static int msrp;
	private static int age;
	
	public CarDealership() {
		
	}
	public CarDealership(String brand) {
		this.brand = brand;
	}
	public int getMSRP() {
		return msrp;
	}
	public void setMSRP(int msrp) {
		CarDealership.msrp = msrp;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		CarDealership.age = age;
	}
}
