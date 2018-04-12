package thread;

public class MovieThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MovieRunnable());
		Thread thread2 = new MusicThread();
		
		thread1.setName("Movie Runnable");
		System.out.println(thread1.getName());
		thread1.start();
		

		System.out.println(thread2.getName());
		thread2.start();
	}
}
