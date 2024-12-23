package Week.Assignment;

import java.util.Arrays;

public class RemoveDuplicateWords {
	public void duplicatewords()
	{
		String input="We learn java basics as part of java sessions in java week1";
		String output="";
		String[] inputArray=input.split(" ");  // convert into string array
		String[] removetheduplicate=new String[inputArray.length]; //create new string builder instance
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<inputArray.length;i++) // apply looping
		{
			String temp=inputArray[i];
			for (int k=0;k<removetheduplicate.length;k++)
			{
				if( temp.equals(removetheduplicate[k]))
				{
				inputArray[i]="  ";
				
				}
			}
			
			removetheduplicate[i]=temp;
			if (i>0) {
				sb.append(" ");
			}
			sb.append(inputArray[i]);
			
			
		}
		output=sb.toString();
		System.out.println(output);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		RemoveDuplicateWords dpWords=new RemoveDuplicateWords();
		dpWords.duplicatewords();


	}

}
