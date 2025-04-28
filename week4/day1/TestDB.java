package week4.day1;

public class TestDB implements DatabseConnection {
	
	
	public void  connect() 
	{
		System.out.println("connect");
	}
	
	
	public void  disconnect()
	{
		System.out.println("disconnect");
	}
	
	public void executeUpdate()
	{
		System.out.println("executeUpdate");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDB T1=new TestDB();
		T1.connect();
		T1.disconnect();
		T1.executeUpdate();
		
	}

}
