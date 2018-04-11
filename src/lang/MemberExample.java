package lang;

public class MemberExample {
	
	public static void main(String[] args) {
		Member original = new Member("sjy","¼ºÁö¿ë","123",27, true);
		Member cloned = original.getMember();
		
		
		cloned.password = "5678";
		
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println(original.toString());
		
		System.out.println();
		
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
		System.out.println(cloned.toString());
				
		
	}
}
