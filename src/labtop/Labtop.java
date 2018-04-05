package labtop;

public class Labtop extends PC implements LanCard, Usb, BlueTooth {

	@Override
	public void getBTCompany() {
		System.out.println(BlueTooth.company);
		
	}

	@Override
	public void getBTVersion() {

		System.out.println(BlueTooth.version);
		
	}

	@Override
	public void getBTConnDevice() {
		System.out.println(BlueTooth.connDevice);
		
	}

	@Override
	public void getUsbCapacity() {
		System.out.println(Usb.capacity);
		
	}

	@Override
	public void getUsbVersion() {
		System.out.println(Usb.version);
		
	}

	@Override
	public void getUsbCompany() {
		System.out.println(Usb.company);
		
	}

	@Override
	public void getLanCardSpeed() {
		System.out.println(LanCard.speed);
		
	}

	@Override
	public void getLanCardVersion() {
		System.out.println(LanCard.version);
		
	}

	@Override
	public void getLanCardCompany() {
		System.out.println(LanCard.company);
		
	}

}

class PC {
	String company = "Samsung";
	
	void print() {
		System.out.println(company + "에서 생산하였습니다.");
		
	}
	
}


interface LanCard {
	// 필드 같아도 자동 상수화 (static final이 생략)
	String speed = "100M";
	double version = 1.0;
	String company = "Samsung";

	public abstract void getLanCardSpeed();
	public abstract void getLanCardVersion();
	public abstract void getLanCardCompany();

}

interface Usb {
	static final String capacity = "16GB";
	static final double version = 3.0;
	static final String company = "Samsung";
	
	public abstract void getUsbCapacity();
	public abstract void getUsbVersion();
	public abstract void getUsbCompany();

}

interface BlueTooth {
	static final String company = "LG";
	double version = 4.0;
	String connDevice = "smart phone";
	
	
	public abstract void getBTCompany();
	public abstract void getBTVersion();
	public abstract void getBTConnDevice();
}
