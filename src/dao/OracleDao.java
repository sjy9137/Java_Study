package dao;

public class OracleDao implements DataAccessObejct {

	@Override
	public void select() {
		System.out.println("OracleDao DB 검색");	
	}

	@Override
	public void insert() {
		System.out.println("OracleDao DB 삽입");	
	}

	@Override
	public void update() {
		System.out.println("OracleDao DB 수정");	
	}

	@Override
	public void delete() {
		System.out.println("OracleDao DB 삭제");	
	}


}
