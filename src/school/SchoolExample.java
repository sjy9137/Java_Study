package school;

public class SchoolExample {
	public static void main(String[] args) {
		Student s1 = new Student(); // �ν��Ͻ�
	/*	Student s2 = new Student(); // �ν��Ͻ�
		Teacher t1 = new Teacher(); // �ν��Ͻ�
		Chair ch1 = new Chair()*/;
		

		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		
		s1.run();
	}
}
