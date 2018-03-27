package operation;


/*논리 연사자 - boolean => true, false
> < >= <= == !=
*/

public class CompareOperation {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		boolean result1 = (a == b);
		boolean result2 = (a > b);
		boolean result3 = (a >= b);
		boolean result4 = (a <= b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
