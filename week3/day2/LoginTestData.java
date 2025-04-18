package week3.day2;

class TestData
{
	
	public void  enterCredentials()
	{
		System.out.println("Calling SuperClass- enterCredential Method");
		
	}
	

	public void navigateToHomePage()
	{
		System.out.println("Calling SuperCalss-navigateToHomePage Method");
		
	}
	
}


public class LoginTestData extends TestData
{


	public void enterUsername()
	{
		
		System.out.println("Calling SubClass-calling enterUsername Method");
		
	}
	
	
	public void enterPassword() 
	{
		System.out.println("Calling SubClass-enterPassword Method");
		
	}
	
	


public static void main(String[] args) {
	// TODO Auto-generated method stub

	LoginTestData Login = new LoginTestData();
	
	Login.enterCredentials();
	Login.navigateToHomePage();
	Login.enterUsername();
	Login.enterPassword();
	
	
	
}

}



