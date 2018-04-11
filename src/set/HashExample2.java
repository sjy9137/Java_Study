package set;

import java.util.*;


public class HashExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("hong", 35));
		set.add(new Member("hong", 35));
		set.add(new Member("yeo",35));
		System.out.println(set.size());
	}
}
