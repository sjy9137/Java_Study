package dao;

public class MySqlDao implements DataAccessObejct{

	@Override
	public void select() {
		System.out.println("MySqul DB �˻�");	
	}

	@Override
	public void insert() {
		System.out.println("MySqul DB ����");
	}

	@Override
	public void update() {
		System.out.println("MySqul DB ����");
	}

	@Override
	public void delete() {
		System.out.println("MySqul DB ����");	
	}

}
