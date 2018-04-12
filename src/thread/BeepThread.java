package thread;

public class BeepThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Beep!!!" + (i));

			try {
				Thread.sleep(1000); // 1ÃÊ
			} catch (Exception e) {

			}

		}

	}
}
