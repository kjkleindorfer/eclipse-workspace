package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.*;


public class TestCDLogic {
	CDBusinessLogic cdbl = new CDBusinessLogic();
	CarDealership cardealership = new CarDealership("Chevy");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculatePrice20() {
		cardealership.setAge(20);
		cardealership.setMSRP(20000);
		double price = cdbl.calculatePrice(cardealership);
		assertEquals(5000, price, 0.0);
	}
	@Test
	public void testCalculatePrice10() {
		cardealership.setAge(10);
		cardealership.setMSRP(20000);
		double price = cdbl.calculatePrice(cardealership);
		assertEquals(10000, price, 0.0);
	}
	@Test
	public void testCalculatePrice5() {
		cardealership.setAge(5);
		cardealership.setMSRP(20000);
		double price = cdbl.calculatePrice(cardealership);
		assertEquals(15000, price, 0.0);
	}
	@Test
	public void testCalculatePriceNew() {
		cardealership.setAge(0);
		cardealership.setMSRP(20000);
		double price = cdbl.calculatePrice(cardealership);
		assertEquals(22000, price, 0.0);
	}
	@Test
	public void testCalculateProfit20() {
		cardealership.setAge(20);
		cardealership.setMSRP(20000);
		double profit = cdbl.calculateProfit(cardealership);
		assertEquals(500, profit, 0.0);
	}
	@Test
	public void testCalculateProfit10() {
		cardealership.setAge(10);
		cardealership.setMSRP(20000);
		double profit = cdbl.calculateProfit(cardealership);
		assertEquals(1000, profit, 0.0);
	}
	@Test
	public void testCalculateProfit5() {
		cardealership.setAge(5);
		cardealership.setMSRP(20000);
		double profit = cdbl.calculateProfit(cardealership);
		assertEquals(1500, profit, 0.0);
	}
	@Test
	public void testCalculateProfitNew() {
		cardealership.setAge(0);
		cardealership.setMSRP(20000);
		double profit = cdbl.calculateProfit(cardealership);
		assertEquals(2000, profit, 0.0);
	}
	@Test
	public void testIsJunk() {
		cardealership.setAge(30);
		assertTrue(cdbl.isJunk(cardealership));
	}

}
