package condition;

public class SwitchPractice {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		
		System.out.println(score+"���� �����Դϴ�.");
		
		
		switch(score/10) {
		case 9: case 10:
			if(score >= 95) {
				System.out.println("A+�Դϴ�.");
			}else {
				System.out.println("A�Դϴ�.");
			}
			break;
		case 8:
			if(score >= 85) {
				System.out.println("B+�Դϴ�.");
			}else {
				System.out.println("B�Դϴ�.");
			}
			break;
		case 7:
			if(score >= 75) {
				System.out.println("C+�Դϴ�.");
			}else {
				System.out.println("C�Դϴ�.");
			}
			break;
		case 6:
			if(score >= 65) {
				System.out.println("D+�Դϴ�.");
			}else {
				System.out.println("D�Դϴ�.");
			}
			break;	
		default:
			System.out.println("F�Դϴ�.");
			break;
			
		}
	}
}
