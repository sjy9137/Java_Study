package runable;

public class BeepTaskExample {
	public static void main(String[] args) {
		 Runnable beep = new BeepTask();
		 Thread thread = new Thread(beep);
		 thread.start();
		 
		 Thread thread2 = new Thread(new BeepTask());
		 thread2.start();
		 
		 
		 Thread thread3 = new Thread(new BeepTask() {
				@Override
				public void run() {
					for(int i = 0 ; i < 10 ; i ++) {
						System.out.println("-----»§»§" +i);
						try {
							Thread.sleep(1000); //1ÃÊ
						} catch(Exception e){
							
						}
					}
				}
		 });
		 thread3.start();
		 
	}
}
