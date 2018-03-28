package condition;

public class SwithchExample {

	public static void main(String[] args) {
		int month = (int) (Math.random() * 12) + 1;

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("해당 " + month + "월은 겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("해당 " + month + "월은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("해당 " + month + "월은 여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("해당 " + month + "월은 가을 입니다.");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
