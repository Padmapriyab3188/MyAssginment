package week4day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare an array {1, 2, 3, 4, 10, 6, 8}
		List<Integer> Array1=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		
		//Arrange the collection in ascending order
		Collections.sort(Array1);
		System.out.println("Ascending Order:" +Array1);
		
		for (int i=0;i<Array1.size()-1;i++)
		{
			 int Current=Array1.get(i);
			 int next=Array1.get(i+1);
			 
			 //loop prints all number between current and Next
			 
			 for (int j=Current+1;j<next;j++)
			 {
				System.out.println("Missing Number:" +j);
				
			}
		
		   
			
		}	
		}
	}


