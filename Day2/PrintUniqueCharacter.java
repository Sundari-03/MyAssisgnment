package week4.Day2;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Alert;

public class PrintUniqueCharacter {


  public void uniqueCharacter(String input) 
  
  { 
	  Set<Character> charshset = new HashSet<>();
       
	  char[] cArray = input.toCharArray();
	  for(char c : cArray)
	  {
		  if(charshset.contains(c))
		  {
			  charshset.remove(c);			 
		  }
		  else
		  {
			  charshset.add(c);
		  }
	  }
	  
    System.out.println(charshset);
		
	  
  }
  public static void main (String[] args)
  {
	  PrintUniqueCharacter printUniqueCharacter = new PrintUniqueCharacter();
	  printUniqueCharacter.uniqueCharacter("Muthupandisundari");
  }
  
}
