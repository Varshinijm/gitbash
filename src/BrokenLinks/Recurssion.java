package BrokenLinks;

public class Recurssion {
	
	public static int recurssion(int n)
	{
		
		int fact=1;
		if(n>0) {
		fact=n*recurssion(n-1);
		}
		return fact;
	}

	public static void main(String args[])
	{
		int factorial = recurssion(4);
		System.out.println(factorial);
	}
}
