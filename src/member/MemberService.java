package member;

public class MemberService {
	String id;
	String password;

	// 생성자 추가
	MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// 등록 매서드 추가
	void CreatMember(String id, String paasword) {
		this.id = id;
		this.password = paasword;
	}

	boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		if (this.id.equals(id)) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		} else {
			System.out.println("id가 불분명합니다.");
		}
	}
}
