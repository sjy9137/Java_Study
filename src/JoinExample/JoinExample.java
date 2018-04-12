package JoinExample;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sTh = new SumThread();
		sTh.start();
		
		try {
			sTh.join();  // sleep 초 단위 이후 wait으로 넘어가고 join은 해당 쓰레드 동작을 마치고 wait으로 이동
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sTh.sum);

	}

}
