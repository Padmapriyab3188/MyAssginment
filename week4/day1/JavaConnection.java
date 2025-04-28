package week4.day1;

public class JavaConnection extends MySqlConnection {

	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println("connect-Inteface");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect-Interface");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate-Interface");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("executeQuery-abstract");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
	}
	
	
}
