package implementsObject;

public class RemoteExample {
	public static void main(String[] args) {
		//�͸� ���� ��ü
		RemoteContral rc = new RemoteContral() {
			public void turnOn(){
				System.out.println("trunOn");
			}
			public void turnOff() {
				System.out.println("trunOff");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
	}
}
