package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Dup= {2,5,7,7,5,9,2,3};
		
		System.out.println("The lenth is:" +Dup.length);
		
		Arrays.sort(Dup);
		for(int i=0; i<Dup.length-1;i++)
		{
		
			if(Dup[i]==Dup[i+1])
			{
				System.out.println("The Duplicate value is:" +Dup[i]);
				
			}
				
			
		}
		
		
		

	}

}
