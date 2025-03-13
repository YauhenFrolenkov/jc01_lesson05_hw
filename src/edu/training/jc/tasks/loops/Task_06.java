package edu.training.jc.tasks.loops;

import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое положительное число");
		System.out.println("> ");
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Вы ввели неверное число. Введите целое положительное число");
			System.out.println("> ");
		}
		x = scanner.nextInt();

		while (x <= 0) {
			System.out.println("Число должно быть положительным. Попробуйте снова.");
			System.out.print("> ");
			x = scanner.nextInt();
		}
		int res = 0;
		for (int i = 1; i <= x; i++) {
			res += i;
		}
		System.out.println("Cумма чисел = " + res);
		scanner.close();

	}

}
