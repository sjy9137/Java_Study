package car;

public class Car {
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	//������ - �ʱ�ȭ�� ����
	/*Car(){ // �⺻������
		System.out.println("������ Car");
		color = "���";
		speed = 0;
	}*/
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
}
