package set;

import java.util.*;


public class HashSetExample3 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));
		
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}
