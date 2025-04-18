package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		
		//Finding the length
		int LengthOftext1 = text1.length();
		int LengthOftext2 = text2.length();
		
		//Print the length
		
		System.out.println("LengthOftext1:"+" "+ LengthOftext1);
		System.out.println("LengthOftext2:"+" "+ LengthOftext2);
		
		//converting string to Char
		if(LengthOftext1==LengthOftext2)
		{
		  char[] CharArray1= text1.toCharArray();
		  char[] CharArray2= text2.toCharArray();
		  
		  //Sorting 
		  Arrays.sort(CharArray1);
		  System.out.print("Sorted Text1:" );
		 
		  for(int i=0;i<LengthOftext1;i++)
		  {
			  System.out.print(CharArray1[i]);
			   
		  }
		  System.out.println();
		  
		  //Sorting
		  Arrays.sort(CharArray2);
		  System.out.print("Sorted Text2:" );
		  for(int i=0;i<LengthOftext2;i++)
		  {
			  System.out.print(CharArray2[i]);
		  }
		
		  System.out.println();
		  if (Arrays.equals(CharArray1, CharArray2))
				  {
			        System.out.println("The given strings are Anagram");
			
				  }
		  else 
		  {
			  System.out.println("The given strings are not an Anagram");
		  }
		 }
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

		
	}
	
	

}


