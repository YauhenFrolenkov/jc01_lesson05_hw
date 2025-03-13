package edu.training.jc.tasks.branching;

import java.util.Scanner;

public class Task_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите сторону a");
		double a = scanner.nextDouble();

		System.out.println("Введите сторону b");
		double b = scanner.nextDouble();

		System.out.println("Введите сторону c");
		double c = scanner.nextDouble();

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Стороны треугольника должны быть положительными числами.");
		} else if (a == b && a == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
		scanner.close();

	}

}
