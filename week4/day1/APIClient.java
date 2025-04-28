package week4.day1;

public class APIClient {
	
	public void sendRequest(String str)
	{
		System.out.println(str);
	}

	public void sendRequest(String str1,String str2,boolean B1 )
	{
		System.out.println(str1+str2+B1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient API=new APIClient();
		API.sendRequest("welcome");
		API.sendRequest("Welcome", "to Testleaf", true);
	}

}
