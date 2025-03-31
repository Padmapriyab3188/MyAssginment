package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		
		int input=1221;
		int output=0;
		
		for(int i=input; i>0; i/=10) 
		{
			int rem=i%10;
			
		
			
			output= output*10+rem;
		}
			
			if(output==input) 
			{
				System.out.println (output +  "is Palindrome");	
		}
			else {
			System.out.println (output +  "is not Palindrome");	
			}
		}
		
	}


