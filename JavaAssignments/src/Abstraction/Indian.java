package Abstraction;

public class Indian implements ATM{
	private int amount = 1000;
	@Override
	public int withdraw(int a) {
		
		int result = amount - a;
		return result;
	}

	@Override
	public int deposit(int b) {
		int result1 = amount + b;
		return result1;
	}


	
	public static void main(String[] args) {
		Indian obj = new Indian();
		Indian obj2 = new Indian();
		int w = obj.withdraw(522);
		int d = obj.deposit(1000);
		System.out.println("remaining balance is : " + w);
		System.out.println("remaining balance is : " + d);
	}
	
	

}
