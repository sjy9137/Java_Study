package condition;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81;

		System.out.println("���� : " + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				if (score == 100) {
					grade = "100�� �ֿ�� �Դϴ�.";
				} else {
					grade = "A+";
				}
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";

			} else {
				grade = "B";
			}
		}

		System.out.println("���� : " + grade);

	}
}
