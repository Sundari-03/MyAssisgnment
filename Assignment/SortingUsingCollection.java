package week4.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {
	public void sortingCollection()
	
	{
		String[] input= {"HCL","Wipro","Aspire Systems","CTS"};  
		Arrays.sort(input);
		List<String> ListInput = Arrays.asList(input);
		
		List<String> NewList = new ArrayList<String>();
		for(int i=ListInput.size()-1;i>=0;i--)
		{
			NewList.add(ListInput.get(i));
		}
		System.out.println(Arrays.toString(NewList.toArray()));
	}

	public static void main (String[] args) 
	{
		SortingUsingCollection sortingUsingCollection = new SortingUsingCollection();
		sortingUsingCollection.sortingCollection();
	}
}
