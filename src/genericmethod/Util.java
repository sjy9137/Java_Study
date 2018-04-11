package genericmethod;

public class Util {
	public static <T> Box<T> boxing (T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
}

class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
}