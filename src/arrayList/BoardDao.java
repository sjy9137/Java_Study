package arrayList;

import java.util.*;
public class BoardDao {

	
	List<Board> list;
	
	public BoardDao() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("����1" , "����1"));
		list.add(new Board("����2" , "����2"));
		list.add(new Board("����3" , "����3"));
	}
	
	public  List<Board> getBoardList() {
		return list;
	}
	
	
	/*public  List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>(3);
		list.add(new Board("����1" , "����1"));
		list.add(new Board("����2" , "����2"));
		list.add(new Board("����3" , "����3"));
		return list;
	}*/
}
