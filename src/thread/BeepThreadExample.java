package thread;

public class BeepThreadExample {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("bnagbang" +i);
			try {
				Thread.sleep(500); //1ÃÊ
			} catch(Exception e) {
				
			}
		}
		
	}
}
