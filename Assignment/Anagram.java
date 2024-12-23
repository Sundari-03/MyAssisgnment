package Week.Assignment;

import java.util.Arrays;

public class Anagram {
	
	public void anagramIndex()
	{
		String input1="stops";  // Input of first word
		String input2="potss"; //  Input of first word
		if(input1.length()==input2.length()) // compare the two input length
		{
			
			char[] inputArray1=input1.toCharArray(); //convert array into character
			char[] inputArray2=input2.toCharArray();
			Arrays.sort(inputArray1); // sort the array
			Arrays.sort(inputArray2);
			
			if(Arrays.equals(inputArray1, inputArray2)) // check the input indices
			{
				System.out.println("The given strings are Anagram");
				
			}
			else {
       
				System.out.println("The given strings are not an Anagram");
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram ag=new Anagram();
		ag.anagramIndex();

	}

}
