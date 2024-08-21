package selenium_basics;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(20,10));
		System.out.println(c.add(20,1,4,2.3,45.6,12,90,9.0,4.333));
	}
}
