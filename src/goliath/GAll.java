package goliath;



public interface GAll extends GtoG, GtoA{
	public void upgradeGuard();
}

interface GtoG{
	public void attatckGround();
	public void upgradeAttG();
}

interface GtoA{
	public void attackAir();
	public void upgradeAttA();
}

