package condition;

public class SwitchPractice {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		
		System.out.println(score+"현재 점수입니다.");
		
		
		switch(score/10) {
		case 9: case 10:
			if(score >= 95) {
				System.out.println("A+입니다.");
			}else {
				System.out.println("A입니다.");
			}
			break;
		case 8:
			if(score >= 85) {
				System.out.println("B+입니다.");
			}else {
				System.out.println("B입니다.");
			}
			break;
		case 7:
			if(score >= 75) {
				System.out.println("C+입니다.");
			}else {
				System.out.println("C입니다.");
			}
			break;
		case 6:
			if(score >= 65) {
				System.out.println("D+입니다.");
			}else {
				System.out.println("D입니다.");
			}
			break;	
		default:
			System.out.println("F입니다.");
			break;
			
		}
	}
}
