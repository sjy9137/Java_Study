package promotion;

public class PromotionExample {
	public static void main(String[] args) {
		// 작은 변수를 큰 변수로 쓸려면 자동 형변환이 된다.
		byte bValue = 10;
		int iValue = bValue;
		
		System.out.println(iValue);
		
		char cValue = '가';  // 유니코드 AC00
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(iValue);
		
		
		// 큰 변수를 작은 변수로 쓸려면 강제 형변환을 해야한다.
		iValue =(int)lValue;
		bValue =(byte)lValue;
	
		System.out.println(iValue);
		System.out.println(bValue);

		
	}
}
