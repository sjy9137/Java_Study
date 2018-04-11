package inheritance2;

public class OtherPair <T, M> extends Pair<T, M>{
	private T t;
	private M m;
	
	OtherPair(T t, M m){
		super(t, m);
	}
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

}
