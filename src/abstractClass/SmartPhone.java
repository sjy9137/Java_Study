package abstractClass;

public class SmartPhone extends Phone{

	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("internetSearch");
	}
	
	@Override
	void call() {
		System.out.println("SmartPhone.call()");
	}
}
