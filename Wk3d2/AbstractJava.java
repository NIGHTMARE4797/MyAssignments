package week3day2;

public abstract class AbstractJava implements DatabseConnection {

	
	
	@Override
	public void connect() {
		System.out.println("Connected");
		// TODO Auto-generated method stub
		
	}

	public abstract void executeUpdate();
}
