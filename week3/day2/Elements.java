package week3.day2;


//Class1
	class WebElement
	{
		
		//String text= "Welcome" ;
		
		public void click()
		{
			System.out.println("Webelement method-Click");
			
		}
		
		public String setText(String text)
		{
			
			System.out.println("get Text method");
		    return text;
			
			
		}
	}

	
	//Class2
  class Button extends WebElement 
  {
		
		public void submit()
		{
			System.out.println("Button method-submit");
		}
		
	}
	
  
  //Class3
	
	class TextField extends Button
	{
		
		public void getText()
		{
			System.out.println("TextField method-getText");
		}
		
	}
	
	
	//Class4
	class CheckBoxButton extends Button
	{
		
		public void clickCheckButton()
		{
			System.out.println("CheckBoxButton method-clickcheckButton");
			
		}
	}
	
	//class5
	class RadioButton extends Button
	{
		
		public void selectRadioButton()
		{
			System.out.println("RadioButton method-selectRadioButton");
		}
	}
	
	
	public class Elements extends Button
	{
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			Elements E=new Elements();
			E.click();
			E.setText("Welcome");
			E.submit();
			
			CheckBoxButton C1=new CheckBoxButton();
			C1.clickCheckButton();
			
			TextField T1=new TextField();
			T1.getText();
			
			RadioButton R1=new RadioButton();
			R1.selectRadioButton();
			
			System.out.println("Inheritance Concept completed successfully");
			

		}


	}
