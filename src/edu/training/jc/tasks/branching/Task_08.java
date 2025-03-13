package edu.training.jc.tasks.branching;

import java.util.Scanner;

public class Task_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите первое число");
		double a = scanner.nextDouble();

		System.out.println("Введите второе число");
		double b = scanner.nextDouble();

		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);

		if (a2 < b2) {
			System.out.println("Наименьшее из квадратов двух чисел а и b = " + a2);
		} else if (a2 > b2) {
			System.out.println("Наименьшее из квадратов двух чисел а и b = " + b2);
		} else {
			System.out.println("Квадраты двух чисел равны");
		}
		scanner.close();

	}

}
