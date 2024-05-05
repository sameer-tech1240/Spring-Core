package com.springcore.ambigutyerrorresolve;

public class Addition {
	private int number;
	private int number1;

	public Addition(int number, int number1) {
		super();
		this.number = number;
		this.number1 = number1;
		System.out.println("Constructor : int , int ");
	}

	public Addition(double number, double number1) {
		super();
		this.number = (int) number;
		this.number1 = (int) number1;
		System.out.println("Constructor : double , double ");
	}
	
	public Addition(String number, String number1) {
		super();
		this.number = Integer.parseInt(number);
		this.number1 =Integer.parseInt(number1);
		System.out.println("Constructor : String , String");
	}

	public int doSum() {
		System.out.println("Value of number : " + this.number);
		System.out.println("Value of number1 : " + this.number1);
		return this.number + this.number1;
	}
	

}
