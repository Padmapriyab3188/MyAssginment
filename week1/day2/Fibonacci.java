package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,num1=0 ,num2=1;
		int i;
		int num3;
		
		for(i=1;i<=n;i++ )
		{
			num3=num2+num1;
			System.out.println(num1+",");
			num1=num2;
			num2=num3;		
		}

	}

}
