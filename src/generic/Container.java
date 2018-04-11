package generic;

public class Container<T, M> {
	private T t;
	private M m;
	public void set(T t, M m) {
		this.t = t;
		this.m = m;}
	public T getKey() {
		return this.t;
	}
	public M getValue() {
		return this.m;
	}
}
