package week4.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestNumber 
{
	public void SecondLargestNum()
	{
		int[] numbers={3, 2, 11, 4, 6, 7};
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length-2]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestNumber secondLargestNumber=new SecondLargestNumber();
		secondLargestNumber.SecondLargestNum();

	}

}
