package Methods;

public class Addition {

	public static void main(String[] args) {
		Addition obj = new Addition();
		System.out.println("sum of numbers is : " + obj.add(6, 6));
	}

	int add(int a, int b) {
		int result = a + b;

		return result;
	}
}
