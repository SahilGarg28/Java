// Write a Java program to print 'Hello' on screen and then print your name on a separate line. 

import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.print("Enter your name: ");
		Scanner cin=new Scanner(System.in);
		String nam=cin.nextLine();
		System.out.println(nam);
	}
}
