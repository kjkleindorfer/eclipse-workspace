package model;

public class CDBusinessLogic {
	public double calculatePrice(CarDealership cardealership) {
		double price = 0;
		if(cardealership.getAge() >= 20) {
			price = cardealership.getMSRP() * 0.25;
		}else if(cardealership.getAge() >= 10) {
			price = cardealership.getMSRP() * 0.5;
		}else if(cardealership.getAge() >= 5) {
			price = cardealership.getMSRP() * 0.75;
		}else {
			price = cardealership.getMSRP() * 1.1;
		}
		return price;
	}
	
	public boolean isJunk(CarDealership cardealership) {
		if(cardealership.getAge() >= 30) {
			return true;
		}
		return false;
	}
	
	public double calculateProfit(CarDealership cardealership) {
		double profit;
		if(cardealership.getAge() >= 20) {
			profit = (cardealership.getMSRP() * 0.25) * .1;
		}else if(cardealership.getAge() >= 10) {
			profit = (cardealership.getMSRP() * 0.5) * .1;
		}else if(cardealership.getAge() >= 5) {
			profit = (cardealership.getMSRP() * 0.75) * .1;
		}else {
			profit = cardealership.getMSRP() * .1;
		}
		return profit;
	}
}
