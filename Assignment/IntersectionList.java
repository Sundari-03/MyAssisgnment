package week4.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionList 

{
	public void Intersection()
	{
        
		
		 
		//convert array to list

		List<Integer> list1 = Arrays.asList(3, 2, 11, 4, 6, 7);
		List<Integer> list2 = Arrays.asList(1, 2, 8, 4, 9, 7);
		
		// Add the elements list
		List<Integer> section = new ArrayList<>(list1); 
		section.retainAll(list2);
		System.out.println("Intersection of the two arrays: " + section);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionList iList= new IntersectionList();
		iList.Intersection();
		

	}

}
