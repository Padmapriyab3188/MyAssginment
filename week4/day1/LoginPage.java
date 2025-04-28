package week4.day1;



public class LoginPage extends BasePage
	{
	
    public void performCommonTasks()
		{
			System.out.println("performCommonTasks-Subclass");
			super.performCommonTasks();
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			LoginPage Login=new LoginPage();
			Login.performCommonTasks();
			Login.clickElement();
		}
	

	}


