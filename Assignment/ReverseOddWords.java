package Week.Assignment;

public class ReverseOddWords {
	public void oddWords() 
	{
		String input="I am a software tester";
		
		String newstr="";
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			newstr=newstr+input.charAt(i);
			
		}
		System.out.println(newstr);
	}

	public static void main(String[] args) {
		ReverseOddWords Words=new ReverseOddWords();
				Words.oddWords();
	}

}
