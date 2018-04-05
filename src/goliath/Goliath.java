package goliath;

public class Goliath implements GAll{

	public static void main(String[] args) {
		Goliath g = new Goliath();
		
		g.attatckGround();
		g.attackAir();
		g.upgradeAttG();
		
	}

	@Override
	public void attatckGround() {
		System.out.println("attatckGround()");
		
	}

	@Override
	public void upgradeAttG() {
		System.out.println("upgradeAttG()");
		
	}

	@Override
	public void attackAir() {
		System.out.println("attackAir()");
		
	}

	@Override
	public void upgradeAttA() {
		System.out.println("upgradeAttA()");
		
	}

	@Override
	public void upgradeGuard() {
		System.out.println("Upgrade Guard()");
		
	}

}
