package edu.training.jc.tasks.branching;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число");
		double a = scanner.nextDouble();

		if (a < 3) {
			System.out.println("yes");
		} else if (a > 3) {
			System.out.println("no");
		}
		scanner.close();

	}

}
