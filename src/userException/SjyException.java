package userException;

public class SjyException extends Exception {
	public SjyException() {

	}

	public SjyException(String message) {
		super(message);
	}
	
	void printType() {
		System.out.println("�ſ�ſ� �߿�!");
	}
}
