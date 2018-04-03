package inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("S9", "White", 7);
		
		dmbCell.bell();
		dmbCell.powerOn();
		
		dmbCell.turnOnDmb();
		dmbCell.changeChannelDmb(8);
		dmbCell.turnOffDmb();
		
	}
}
