package action;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { // �͸� ���� ��ü
			public void work() {
				System.out.println("���縦 �մϴ�.");
				
			}
		};
		
		action.work();
	}
}
