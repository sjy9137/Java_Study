package shareMeomory;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCalc(Calculator cal) {
		this.setName("Cal User1");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(100);
	}
}
