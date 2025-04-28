package week4day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array {3, 2, 11, 4, 6, 7}. 
		List<Integer> Array1=new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		
		//Arrange the collection in ascending order
	    Collections.sort(Array1);
		
		System.out.println("Ascendin Order:" +Array1);
		
		//Pick the 2nd element from the last and print it. 
		System.out.println("Second Largest Number:" +Array1.get(3));

	}

}
