package login;

public class NotExistIDExeption extends Exception {
	
	
	public NotExistIDExeption() {
		
	}

	public NotExistIDExeption(String message) {
		super(message);
	}
}
