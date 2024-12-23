package Week.Assignment;

public class Reverseoddword {
	
	public void oddWord()
	{
		String input = "I am a software tester"; // create the input
		String output= ""; 
		String[] inputArray = input.split(" ");  // convert into string array
		
		for (int i=0;i<inputArray.length;i++) // apply looping
		{
		if(i==0) 
		{
			output=inputArray[i];
			
		
		}
		else if(i%2==0) 
		{
			output=output+" "+inputArray[i];
		}
		else {
			String inputWord=inputArray[i];
		    String Reverse="";
			for(int j=inputWord.length()-1;j>=0;j--)
			{
				
				Reverse=Reverse+inputWord.charAt(j);
			}
			output=output+" "+Reverse;
		}
	}
		System.out.println(output);
		
	}
	

	public static void main(String[] args) {
		Reverseoddword reverse=new Reverseoddword();
		reverse.oddWord();
	}

}
