package lang;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult){
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	} 
	public Member getMember() {
		Member cloned = null;
		try {
			//cloned = this;
			cloned = (Member) clone();
		} catch(Exception e){
			//CloneNotSupportedException
		}
		
		return cloned;
	}
	
	
}
