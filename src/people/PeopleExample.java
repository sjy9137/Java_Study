package people;

public class PeopleExample {
	public static void main(String[] args) {
		Police pol = new Police();

		pol.run();
		pol.Mode = Male.MALE;
		pol.run();
		pol.Mode = Male.POLICE;
		pol.run();
	}
}
