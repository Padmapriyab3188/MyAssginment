package week4.day1;

public class BasePage {
	
	public void findElement()
	{
		System.out.println("findElement-Superclass");
	}

	public void clickElement()
	{
		System.out.println("clickElement-Superclass");
	}
	
	public void enterText()
	{
		System.out.println("enterText-Superclass");
	}
	
	public void performCommonTasks()
	{
		System.out.println("performCommonTasks-Superclass");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage Base=new BasePage();
		Base.findElement();
		Base.clickElement();
		Base.enterText();
		Base.performCommonTasks();
		

	}

}


