package condition;

public class IfMathExample {
	public static void main(String[] args) {
		
		int in = (int)(Math.random()*12)+1;
		int day = (int)(Math.random()*90)+1;
		System.out.println(in);
		
		if(in==12 && in <= 2) {
			System.out.println("겨울 입니다.");
			if(day >= 45) {
				System.out.println("늦겨울 입니다.");
			}
		}else if(in >=9 && in <= 11) {
			System.out.println("가을 입니다.");			
		}else if(in >=6 && in <= 8) {
			System.out.println("여름 입니다.");			
		}else if(in >=3 && in <= 5) {
			System.out.println("봄 입니다.");			
		}	
	}
}
