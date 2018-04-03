package inheritance;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel + "º¯°æ");
	}
	void turnOffDmb() {
		System.out.println("turnOffDmb()");
	}
	
}
