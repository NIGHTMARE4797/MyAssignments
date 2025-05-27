package week3day2;

public interface DatabseConnection {
	
	

    public void connect();

	default void disconnect() {
		System.out.println("Disconnected");
		}
}
