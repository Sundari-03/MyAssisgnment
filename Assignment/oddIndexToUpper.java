package Week.Assignment;

public class oddIndexToUpper
{
	public void oddIndexUpper() 
	{
	String input="change"; // create inputs
	StringBuilder sb = new StringBuilder(); //create new string builder instance
	for(int i=0;i<input.length();i++) // apply looping
	{
		if(i==0 || i%2==0)
		{
			sb.append(input.charAt(i));
		}
		else
		{
			String temp=Character.toString(input.charAt(i));
			sb.append(temp.toUpperCase()); 
			
			
		}
	}
	System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        oddIndexToUpper odd = new oddIndexToUpper();
				odd.oddIndexUpper();

	}

}
