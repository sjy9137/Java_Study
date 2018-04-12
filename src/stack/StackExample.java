package stack;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> stack = new Stack();
		stack.push(new Coin(10));
		stack.push(new Coin(50));
		stack.push(new Coin(100));
		stack.push(new Coin(500));
		
		
		while(!stack.empty()) {
		Coin coin = stack.pop();
		System.out.println(coin.getValue());
		}
	}
}
