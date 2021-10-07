package Getter_Setters;

public class Computer_info {
	
	public static void main(String[] args) {

		Computer c1 = new Computer();
		c1.setCname("dell");
		c1.setCyear(2021);
		c1.setCcost(1800.99);
		System.out.println("Computer "+ c1.getCname());
		System.out.println("Computer "+ c1.getCyear());
		System.out.println("Computer  "+ c1.getcCost());

		
