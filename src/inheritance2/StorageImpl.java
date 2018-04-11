package inheritance2;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	public StorageImpl(int capa) {
		this.array = (T[]) (new Object[capa]);  //������Ʈ�� �ֻ��� Ŭ�����̹Ƿ� �ش� TŸ������ ����ȯ
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
