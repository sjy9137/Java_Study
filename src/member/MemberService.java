package member;

public class MemberService {
	String id;
	String password;

	// ������ �߰�
	MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// ��� �ż��� �߰�
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
			System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
		} else {
			System.out.println("id�� �Һи��մϴ�.");
		}
	}
}
