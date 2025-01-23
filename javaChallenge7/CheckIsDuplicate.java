package javaChallenge7;

import java.util.Arrays;

public class CheckIsDuplicate {
	
	public void checkDuplicate() {
	
	int[] inputArray = {1,5,1,6,8,4,5};
	Arrays.sort(inputArray);
	 boolean isDuplicate = false;
	 
	for(int i=0;i<inputArray.length;i++)
	{
		if(i<inputArray.length)
		{
			int num1 = inputArray[i];
			int num2 = inputArray[i+1];
			
			if(num1 == num2)
			{
				isDuplicate = true;
				break;
				
			}
			
			
		}
	}
	
		System.out.println( isDuplicate);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIsDuplicate isDuplicate = new CheckIsDuplicate();
		isDuplicate.checkDuplicate();
	}
		
	

}
