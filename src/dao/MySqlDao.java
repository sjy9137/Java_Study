package dao;

public class MySqlDao implements DataAccessObejct{

	@Override
	public void select() {
		System.out.println("MySqul DB 검색");	
	}

	@Override
	public void insert() {
		System.out.println("MySqul DB 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySqul DB 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySqul DB 삭제");	
	}

}
