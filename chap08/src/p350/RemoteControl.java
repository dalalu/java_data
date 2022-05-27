package p350;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상메소드
	void turnOn();
	void turnOff();
	void SetVolume(int volume);
	
	
	//디폴트 메소드
	default void SetMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적메소드
	static void ChangeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	void setMute(boolean mute);

}
