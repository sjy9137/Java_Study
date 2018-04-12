package threadPriority;

public class CalcThread extends Thread{

	public CalcThread(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch(Exception e) {
			
		}
		System.out.println(this.getName());
	}
}
