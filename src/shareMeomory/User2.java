package shareMeomory;

public class User2 extends Thread{
	private Calculator cal;
	
	public void setCalc(Calculator cal) {
		this.setName("Cal User2");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(50);
	}
}
