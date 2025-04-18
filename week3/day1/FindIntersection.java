package week3.day1;

//import io.cucumber.java.lu.a;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7};
         
         int num1=a.length;
         int num2=b.length;
         
         for(int i=0;i<num1;i++)
         {
        	for (int j=0;j<num2;j++) 
        	{
        		if(a[i]==b[j])
        		{
        		System.out.println("IntersectionNumber:" +a[i]);
        		}
        	}
           
         }
        
	}
	

}
