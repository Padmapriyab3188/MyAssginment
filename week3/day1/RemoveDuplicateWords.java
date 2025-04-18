package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String text="We learn java basics as part of java sessions in java week1";
    //int count=0;
    
    //Split the text into an array of words using space as the delimiter
    String[] words=text.split(" ");
    for(int i=0;i<words.length;i++)
    {
    	for(int j=i+1;j<words.length;j++)
    	{
    		if(words[i].equals(words[j]))
    		{
    			words[j]=" ";
    		}
    		
         }
    	System.out.print(" "+words[i]);
    	
    	}
    }
    
	}


