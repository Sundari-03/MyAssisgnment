package week4.Day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

      public void rdupliccates(String input)
      {
    	
  // Dh ana
//  		Convert it into a character array
    	  
    	 char[] inputArray=input.toCharArray();
    	 
//  		Declare a Set as charSet for Character
    	 
    	 Set<Character> charSet = new HashSet<>();

//  		Declare a Set as dupCharSet for duplicate Character
    	 Set<Character> dupcharSet = new HashSet<>();

//  		Iterate character array and add it into charSet
    	 
    	 for(char c : inputArray)
    	 {
//   		if the character is already in the charSet then, add it to the dupCharSet
    		
    		
	    		 if(charSet.contains(c))
	    		 {
	    			 dupcharSet.add(c);
	    		 }
	    		 else
	    		 {
	    			 charSet.add(c);
	    		 }
    	 }
    	 
    		 for(char c : dupcharSet)
    		 {
    			if(charSet.contains(c)) 
    			{
    				charSet.remove(c);
    			}
    		 }
    		 for (char c : charSet)
    		 {
    		if(c!=' ')
    		{
    			System.out.println(c);
    		}
    		 }
    		 
//  		Iterate using charSet

//  		Check the iterator variable isn't equals to an empty space

       
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.rdupliccates("Pay Pal");

	}

}
