package inheritance2;

public class Pair <T, M>{
	private T t;
	private M m;
	
	Pair(T t, M m){
		this.t= t;
		this.m= m;
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
