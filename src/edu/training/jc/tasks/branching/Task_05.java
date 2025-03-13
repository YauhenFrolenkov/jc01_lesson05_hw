package edu.training.jc.tasks.branching;

import java.util.Scanner;

public class Task_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите первое число");
		double a = scanner.nextDouble();

		System.out.println("Введите второе число");
		double b = scanner.nextDouble();

		if (a < b) {
			System.out.println("Наименьшее число " + a);

		} else if (a > b) {
			System.out.println("Наименьшее число " + b);
		} else {
			System.out.println("Введенные числа равны");
		}
		scanner.close();

	}

}
