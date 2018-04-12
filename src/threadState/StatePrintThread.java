package threadState;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("State : " +state );
			
			if(state == Thread.State.NEW){
				targetThread.start();  // Runnable로 넘어감
			}
			
			if(state == Thread.State.TERMINATED) {
				break;  //종료일 때 스레드 종료
			}
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
			
		}//while
	}//run
	
}
