package yiledXample;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("작업중 B");
			}else {
				Thread.yield();
			}
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}	
		}
		System.out.println("TreadB 종료");
		
	}
}
