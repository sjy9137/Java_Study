package yiledXample;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("�۾��� B");
			}else {
				Thread.yield();
			}
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}	
		}
		System.out.println("TreadB ����");
		
	}
}
