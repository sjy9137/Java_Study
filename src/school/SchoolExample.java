package school;

public class SchoolExample {
	public static void main(String[] args) {
		Student s1 = new Student(); // 인스턴스
	/*	Student s2 = new Student(); // 인스턴스
		Teacher t1 = new Teacher(); // 인스턴스
		Chair ch1 = new Chair()*/;
		

		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		
		s1.run();
	}
}
