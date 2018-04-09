package buy;

public class Exercise {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if (money >= p.price) {
			money -= p.price;
			this.add(p);
		} else {

			System.out.println("잔액이 부족하여 " + p + " 을/를 살수 없습니다.");
		}
	}

	void add(Product p) {

		if (this.i >= this.cart.length) {
			Product[] cart2 = new Product[this.cart.length * 2];
		/*	for (int i = 0; i < cart.length; i++) {
				cart2[i] = this.cart[i];
			}

			this.cart = new Product[i * 2];

			for (int i = 0; i < this.cart.length; i++) {
				this.cart[i] = cart2[i];
			}*/
			
			System.arraycopy(cart, 0, cart2, 0 , cart.length);
			cart = cart2;
		}
		this.cart[this.i] = p;
		this.i += 1;
	}

	void summary() {
		
		int sum = 0;
		
		System.out.print("구입한 물건 : ");
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null)
			System.out.print(this.cart[i] + ", ");
		}
		
		System.out.println();

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null)
				sum += cart[i].price;
		}

		System.out.println("충 구매 가격 : " + sum);
		System.out.println("사고 남은 금액 : " + (this.money));
	}

}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
