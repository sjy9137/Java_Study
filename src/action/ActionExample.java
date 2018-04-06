package action;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { // 익명 구현 객체
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
		};
		
		action.work();
	}
}
