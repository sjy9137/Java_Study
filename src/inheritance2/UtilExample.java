package inheritance2;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿" );
		System.out.println(age);
		
		ChildPair<String, Integer> childpair = new ChildPair<>("ȫ���", 20);
		Integer childage = Util.getValue(childpair, "ȫ���" );
		System.out.println(childage);
		
		
	}
}
