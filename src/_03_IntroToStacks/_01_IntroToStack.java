package _03_IntroToStacks;

import java.util.Random;

import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	
	static Random  r = new Random();
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> dos = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i<100; i++) {
			double y = r.nextInt(100);
			dos.push(y);
			
			
			
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String fn = JOptionPane.showInputDialog(" Enter in your first number between 0 and 100");
		String sn = JOptionPane.showInputDialog(" Enter in your second number between 0 and 100(must be higher than first number)");
		
		
		
		
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int n1 =   Integer.parseInt(fn);
		int n2 =   Integer.parseInt(sn);
		double n11 = n1;
		double n22 = n2;
		
		
		for (Double j = 0.0; j < dos.size(); j++) {
			double curr = dos.pop();
		
		
		if (n11<curr&&curr<n22) {
			System.out.println(curr);
			
		}
		
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
