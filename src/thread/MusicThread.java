package thread;

public class MusicThread extends Thread {
	public MusicThread() {
		this.setName("Music Thread");
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("������ ����մϴ�.");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
