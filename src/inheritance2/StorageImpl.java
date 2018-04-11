package inheritance2;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	public StorageImpl(int capa) {
		this.array = (T[]) (new Object[capa]);  //오브젝트는 최상위 클래스이므로 해당 T타입으로 형변환
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	@Override
	public T get(int index) {
		return array[index];
	}
	
}
