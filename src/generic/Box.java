package generic;

//제네릭 클래스, 인터페이스
// 제네릭 매서드

public class Box<T, M> {
	private T t;
	private M m;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
	public void setM(M m) {
		this.m = m;
	}
	
	public M getM() {
		return m;
	}
	
}

class Apple{
	
	
}
