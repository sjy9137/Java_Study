package operation;

public class SingleOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int c;
		
		int i =1;
		
		a = 10;
		b = 20;
		c = a + b;
	/*	System.out.println(c);
		
		c = b - a;
		System.out.println(c);
		c = b / a;
		System.out.println(c);
		c = c % a;
		System.out.println(c);	*/
		
		
		i++;
		System.out.println("i" + " " +i);
		i--;
		System.out.println("i" + " " +i);
		
		++i;
		System.out.println("i" + " " +i);
		i--;
		System.out.println("i" + " " +i);
		System.out.println("i++" + " " +(i++));
		System.out.println("i" + " " +(i));
		
		//System.out.println("i--" + " " +(i--));
		
		boolean ok = true;
		System.out.println(ok);
		ok = !ok;
		System.out.println(ok);
		
		int var1 = 10;
		System.out.println(var1);
		var1 = ~var1;  // 반전 발생
		System.out.println(var1);
	}
}
