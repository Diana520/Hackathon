package task1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		sum();
	}

	public static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("type in 2 numbers");
		System.out.println("enter first one: ");
		int firstNumb = sc.nextInt();
		System.out.println("enter second one: ");
		int secondNumb = sc.nextInt();
		int sum = firstNumb + secondNumb;
		System.out.println(firstNumb + " + " + secondNumb + " = " + sum);
	}

}
