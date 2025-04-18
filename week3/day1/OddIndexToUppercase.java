package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String test="changeme";
	
	//Convert the given String to a character array.
	char[] charArray = test.toCharArray();
	
	for(int i=0;i<=charArray.length;i++)
	{
		if(i%2!=0)
		{
			charArray[i]=Character.toUpperCase(charArray[i]);
	   }
	}
	
  //convert the array back to string
	String result=new String(charArray);
	
	System.out.println(result);
	
}
}
