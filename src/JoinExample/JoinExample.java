package JoinExample;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sTh = new SumThread();
		sTh.start();
		
		try {
			sTh.join();  // sleep �� ���� ���� wait���� �Ѿ�� join�� �ش� ������ ������ ��ġ�� wait���� �̵�
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sTh.sum);

	}

}
