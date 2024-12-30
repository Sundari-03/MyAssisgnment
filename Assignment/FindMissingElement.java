package week4.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElement 
{
	public void missingElement()
	{
		int[] numbers={1, 2, 3, 4, 10, 6, 8};// Declare the input
		Arrays.sort(numbers); //sort the numbers
		List<Integer> missingNumbers = new ArrayList<Integer>(); //List the numbers
		for(int i=0;i<numbers.length;i++)
		{
			if(i +1<numbers.length)
			{
			    int currentNumber=numbers[i];
			    int newNumber=numbers[i+1];
			    
			    if(currentNumber+1 != newNumber) // Compare the values
			   {
			    	missingNumbers.add(currentNumber+1);
			   }
			 }
				

		}
		System.out.println(Arrays.toString(missingNumbers.toArray()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMissingElement findMissingElement = new FindMissingElement();
		findMissingElement.missingElement();
	}

}
