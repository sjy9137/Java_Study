package runable;
;

public class BeepTask implements Runnable {
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("¶¯¶¯" +i);
			try {
				Thread.sleep(500); //0.5ÃÊ
			} catch(Exception e){
				
			}
		}
	}

}
