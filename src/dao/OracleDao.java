package dao;

public class OracleDao implements DataAccessObejct {

	@Override
	public void select() {
		System.out.println("OracleDao DB �˻�");	
	}

	@Override
	public void insert() {
		System.out.println("OracleDao DB ����");	
	}

	@Override
	public void update() {
		System.out.println("OracleDao DB ����");	
	}

	@Override
	public void delete() {
		System.out.println("OracleDao DB ����");	
	}


}
