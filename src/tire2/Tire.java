package tire2;

public interface Tire {
	void roll();
	
	default void stop() {
		
	};
}
