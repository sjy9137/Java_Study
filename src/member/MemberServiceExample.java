package member;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService("hong", "12345");
		boolean result = memberService.login("hong", "12345");
	
		//memberService.CreatMember("hong", "12345"); // 등록 메서드
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
