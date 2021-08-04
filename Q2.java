//Write a Java program to print the sum of two numbers. 

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
sum s=new sum();
s.input();
System.out.println(s.process());
}
}
class sum{
	Scanner cin=new Scanner(System.in);
	float a,b;
	void input()
	{
		System.out.print("Enter 1st number: ");
		a=cin.nextFloat();
		System.out.print("Enter 2nd number: ");
		b=cin.nextFloat();
	}
	float process()
	{	
		return a+b;
		
	}
	
}
