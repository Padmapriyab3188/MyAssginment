package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		for(int i=2;i<=n;i++)
		{
			if (n%i==0) 
			{
			
			System.out.println(n + "is not prime number");
			break;
			
			}
			else 
			{
				System.out.println(n + "is prime number");
				break;
			}
		}
		}
}
		
		



