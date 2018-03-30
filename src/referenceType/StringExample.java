package referenceType;

public class StringExample {

	public static void main(String[] args) {
		String str = "성지용";
		String str2 = new String("성지용");  // 객체를 만들때 마다 새로운 주소를 만드므로 상수 정의와는 다르게 비교를 하였을 때 다르다고 나옴
		String str3 = "성지용";
		String str4 = new String("성지용");
		if(str == str2) {
			System.out.println("str 과 str2는 같다.");
		}else {
			System.out.println("str 과 str2는 다르다.");
		}
		
		if(str == str3) {
			System.out.println("str 과 str3는 같다.");
		}else {
			System.out.println("str 과 str3는 다르다.");
		}
		
		
		if(str2 == str3) {
			System.out.println("str2 과 str3는 같다.");
		}else {
			System.out.println("str2 과 str는 다르다.");
		}
		
		if(str2.equals(str4)) {  // equals는 객체의 값만을 체크하는 것이고 ==은 주소를 기반으로 체크(즉 상수에서만 사용)
			System.out.println("str2 과 str4는 같다.");
		}else {
			System.out.println("str2 과 str4는 다르다.");
		}

	}

}
