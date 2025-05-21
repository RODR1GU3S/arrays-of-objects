package application;

import java.util.Scanner;

import util.SumElement;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many values will each array have? ");
		int quantity = sc.nextInt();

		SumElement[] arrayA = new SumElement[quantity];
		SumElement[] arrayB = new SumElement[quantity];
		SumElement[] arraySum = new SumElement[quantity];

		System.out.println("Enter the values of array A: ");
		for (int i = 0; i < arrayA.length; i++) {
			int number = sc.nextInt();
			arrayA[i] = new SumElement(number);
		}

		System.out.println("Enter the values of array B: ");
		for (int i = 0; i < arrayB.length; i++) {
			int number = sc.nextInt();
			arrayB[i] = new SumElement(number);
		}

		for (int i = 0; i < arraySum.length; i++) {
			arraySum[i] = new SumElement(arrayA[i].getNumber() + arrayB[i].getNumber());
		}

		System.out.println("RESULTING arraySum:");
		for (int i = 0; i < arraySum.length; i++) {
			System.out.println(arraySum[i].getNumber());
		}

		sc.close();
	}

}
