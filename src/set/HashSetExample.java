package set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("java");
		set.add("jiyong");
		set.add("mina");
		set.add("java");
		set.add("mina");

		int size = set.size();
		System.out.println(size);
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}

	}

}
