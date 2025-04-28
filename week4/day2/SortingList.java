package week4day2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

String C1="HCL";


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
	
		
		List<String> str=new ArrayList<String>();
		str.add("HCL");
		str.add("Wipro");
		str.add("Aspire Systems");
		str.add("CTS");
		
		//ascending order
		Collections.sort(str);
		System.out.println("Ascending Order:" +str);
		
		//Use reverse loop to iterate the collection 
		for(int i=str.size()-1;i>=0;i--) 
		{
			System.out.println(str.get(i));
		}
	}

}
