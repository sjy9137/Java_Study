package generic;

//���׸� Ŭ����, �������̽�
// ���׸� �ż���

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
