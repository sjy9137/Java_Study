package warrior;

public class Warrior {
	private int hp = 40;
	private boolean mode = false;
	private int power = 5;

	void setPower(final int power) {
		this.power = power;
	}

	int getPower() {
		return this.power;
	}

	void attack(Warrior enemy) {
		enemy.hp -= power * ((mode == true) ? 2 : 1);
	}

	void stimpak() {
		mode = !mode;
	}

	@Override
	public String toString() {
		if (mode) {
			return "체력은  " + hp + " 입니다.";
		} else {
			return "체력은  " + hp + " 입니다.";
		}
	}
}
