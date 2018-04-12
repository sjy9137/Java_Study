package threadState;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrint = new StatePrintThread(new TargetThread());
		
		statePrint.start();
	}
}
