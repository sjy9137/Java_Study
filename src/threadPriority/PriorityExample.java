package threadPriority;

public class PriorityExample {
	public static void main(String[] args) {
		int j = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			Thread thread = new CalcThread("thread - " +i);
			if(i == 10) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else if(i == 9){
				thread.setPriority(Thread.MAX_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			//thread.setPriority(i);
			thread.start();
			j++;
		}
	}
}
