package inheritance2;

public class Util {
	public static <T, M> Integer getValue(Pair<T, M> p, T t){
		if(p.getT().equals(t)) {
			return (Integer) p.getM();
		}
		return null;

	}
}
