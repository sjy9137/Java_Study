package operation;

public class homework4 {
	public static void main(String[] args) {
		int Money = 27960;
		
		int result1 = 10000;
		int result2 = 5000;
		int result3 = 1000;
		int result4 = 500;
		int result5 = 100;		
		int result6 = 10;
		
		int count = 0;
		
		System.out.println("현재 금액은 "+ Money + "원은 입니다.");
		
		
		count = Money / result1;
		Money = Money - (count * result1);
		System.out.println(result1 + "원은 : " + count +"개 입니다.");
		count = 0;
		
		count = Money / result2;
		Money = Money - (count * result2);
		System.out.println(result2 + "원은 : " + count +"개 입니다.");
		count = 0;
		
		count = Money / result3;
		Money = Money - (count * result3);
		System.out.println(result3 + "원은 : " + count +"개 입니다.");
		count = 0;
		
		count = Money / result4;
		Money = Money - (count * result4);
		System.out.println(result4 + "원은 : " + count +"개 입니다.");
		count = 0;
		
		count = Money / result5;
		Money = Money - (count * result5);
		System.out.println(result5 + "원은 : " + count +"개 입니다.");
		count = 0;
		
		count = Money / result6;
		Money = Money - (count * result6);
		System.out.println(result6 + "원은 : " + count +"개 입니다.");
	
	}
}

