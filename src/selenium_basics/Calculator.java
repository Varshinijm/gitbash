package selenium_basics;

public class Calculator {

	public double add(double...ref)
	{
		double sum=0;
		for(double a:ref)
		{
			sum+=a;
		}
		return sum;
	}
}
