package inheritance;

public class Car {
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
/*	private int speed;
	private boolean stop;*/
	
	//������ - �ʱ�ȭ�� ����
	Car(){ // �⺻������
		System.out.println("������ Car");
		color = "���";
		speed = 0;
	}
	
	
	//������2 - �ʱ�ȭ�� ����
	Car(int maxSpeed){ 
		System.out.println("������ Car(int)");
		this.maxSpeed = maxSpeed;
	}
	Car(int maxSpeed, int speed){ 
		System.out.println("������ Car(int)");
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	
	
	/*public int getSpeed() {
		return speed;
		
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}	*/
}
