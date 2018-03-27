package operation;

public class homework1 {
	public static void main(String[] args) {
		int pecils = 534;
		int students = 30;
		
		int pencilsPerStudent = pecils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pecils % students;
		System.out.println(pencilsLeft);
	}
}
