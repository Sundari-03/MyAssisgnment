package Wek1.day2;

public class CheckNumberIsPositive
{
	// T ocheck the given input is positive
	
  public void CheckNumber(int n) 
  {
	  
	  // Check the given input number is greater than equal to zero or not
	  if (n>=0)
	  {
		 
		 System.out.println("The given number "+n +" is positive");		  
	  }
	  
	  else
	  {
		  System.out.println("The given number "+n +" is negative");
	  }
  }
  
	public static void main(String[] args) {
		// To create objects
		CheckNumberIsPositive check=new CheckNumberIsPositive();
		check.CheckNumber (10);
		check.CheckNumber(6);
		check.CheckNumber(-5);

	}

}
