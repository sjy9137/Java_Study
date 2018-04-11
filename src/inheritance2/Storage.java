package inheritance2;

public interface Storage<T> {
	public void add(T item, int idex);
	public T get(int index);
}
