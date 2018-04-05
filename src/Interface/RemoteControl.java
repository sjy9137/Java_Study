package Interface;

public interface RemoteControl {
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 10;
	// �߻�ż���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void voiceAI(String voice) {
		System.out.println(voice);
	}
	
	static void chamgeBattery() {
		System.out.println("chamgeBattery");
	}
}
