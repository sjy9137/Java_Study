package member;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService("hong", "12345");
		boolean result = memberService.login("hong", "12345");
	
		//memberService.CreatMember("hong", "12345"); // ��� �޼���
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
