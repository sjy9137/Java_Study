package warrior;

public class Battle {

	public static void main(String[] args) {
		Marine[] marine = { new Marine(),
				new Marine(),
				new Marine()
				}; 
		
		Firebet firebet = new Firebet();
		Warrior warrior = new Warrior();
		firebet.attack(marine[0]);
		firebet.attack(marine[1]);
		firebet.attack(marine[2]);
		
		System.out.println(marine[0].toString());
		System.out.println(marine[1].toString());
		System.out.println(marine[2].toString());
		
		int i =0;
		for(Warrior w : marine) {
			w.attack(marine[i]);
			i++;
		}
		
		

		
		
		System.out.println(marine[0].toString());
		System.out.println(marine[1].toString());
		System.out.println(marine[2].toString());
		
		
		warrior = marine[0];
		
		
		if(warrior instanceof Firebet) {
			System.out.println("warrior 는 Firebet 입니다.");
		}else if(warrior instanceof Marine) {
			System.out.println("warrior 는 marine 입니다.");
		}
		
	}

}
