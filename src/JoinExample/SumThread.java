package JoinExample;

public class SumThread extends Thread{
	public long sum;
	
	public void run() {
		for(int i = 0 ; i <= 100 ; i++) {
			sum += 100;
		}
	}
}
