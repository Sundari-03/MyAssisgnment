package Wek1.day2;

public class FibonacciSeries {
	 
	// To display fibonacci series number by given input
	public void DisplayFibonacciSereis(int count)
	
	{
		// Declare the initial two value
		int n1=0,n2=1,n3;
		System.out.print(n1 +" "+ n2);
		for(int i=2;i<count;i++)			
		{
	
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;			
		}		
				
	}

	public static void main(String[] args) {
		// To create objects
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		System.out.println("FibonacciSeries 8 ");
		fibonacciSeries.DisplayFibonacciSereis(8);

	}

}
