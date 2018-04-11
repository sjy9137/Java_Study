package inheritance2;

public class Util {
	public static <T, M > M getValue(Pair<T, M> p, T t){
		if(p.getT().equals(t)) {
			return p.getM();
		}
		return null;

	}
}
