package week3day2;

public class ConcreteJavaConnection extends AbstractJava {
	
	public static void main(String[] args) {
		ConcreteJavaConnection obj = new ConcreteJavaConnection();
		obj.connect();
		obj.disconnect();
	    obj.executeUpdate();
}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update Excecuted");
		
	}}
