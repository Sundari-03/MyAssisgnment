package Wek1.day2;
public class IsPrimeNumber
{  
	
	// To check the given number is prime
	public void CheckPrimeNumber(int n) 
	{
			Boolean isPrime=true;
		
		for(int x=2;x<n;x++) 
		{
			
			if(n%x==0) 
			{
			 
				isPrime=false;
				break;
			}				
				 
		}
		
		
		if(isPrime) 
		{
			
			System.out.println("The given number "+ n+" is prime");
		}
		else
		{
			System.out.println("The given number "+ n+"is not prime");
		}
			
	}
	
	public static void main(String[]args)
	
	{
		IsPrimeNumber checkNumber=new IsPrimeNumber();
		checkNumber.CheckPrimeNumber (5);
		checkNumber.CheckPrimeNumber(10);
		checkNumber.CheckPrimeNumber (7);
		checkNumber.CheckPrimeNumber (13);
		
		
		
	}
}
