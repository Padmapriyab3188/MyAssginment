package week4day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array for {3, 2, 11, 4, 6, 7} 
		List<Integer> Array1=new ArrayList<Integer>();
		
		Array1.add(3);
		Array1.add(2);
		Array1.add(11);
		Array1.add(4);
		Array1.add(6);
		Array1.add(7);
		
		int sizeOfArray1 = Array1.size();
		System.out.println("The size of Array1:" +sizeOfArray1);
		
		
		//Declare another array for {1, 2, 8, 4, 9, 7} 
		List<Integer> Array2=new ArrayList<Integer>();
		
		Array2.add(1);
		Array2.add(2);
		Array2.add(8);
		Array2.add(4);
		Array2.add(9);
		Array2.add(7);
		
		int sizeOfArray2 = Array1.size();
		System.out.println("The size of Array1:" +sizeOfArray2);
		
		//Compare both the arrays 
		for (int i=0;i<sizeOfArray1;i++)
		{
			for (int j=0;j<sizeOfArray2;j++)
				if(Array1.get(i).equals(Array2.get(j)))
				{
					System.out.println("Common element:" +Array1.get(i));
				}
		}
 
		
		
		
		

	}

}
