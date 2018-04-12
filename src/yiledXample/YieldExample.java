package yiledXample;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(1000);
			tA.work = false;
		}catch(Exception e) {
		
		}
		
		System.out.println("tA.work = false");
		
		
		try {
			Thread.sleep(1000);
			tA.work = true;
		}catch(Exception e) {
		
		}
		
		
		System.out.println("tA.work = true");
		
		try {
			Thread.sleep(1000);
			tA.stop = true;
			tB.stop = true;
		}catch(Exception e) {
			
		}	
	
	}
}
