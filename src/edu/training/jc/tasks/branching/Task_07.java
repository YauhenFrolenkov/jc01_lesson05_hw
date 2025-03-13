package edu.training.jc.tasks.branching;

import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите значение a");
		double a = scanner.nextDouble();

		System.out.println("Введите значение b");
		double b = scanner.nextDouble();

		System.out.println("Введите значение c");
		double c = scanner.nextDouble();

		System.out.println("Введите значение x");
		double x = scanner.nextDouble();

		double res = a * x * x + b * x + c;

		double mod = Math.abs(res);

		System.out.println("Модуль выражения a*x*x + b*x + c = " + mod);

		scanner.close();

	}

}
