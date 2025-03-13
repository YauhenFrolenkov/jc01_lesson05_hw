package edu.training.jc.tasks.loops;

public class Task_05 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 99) {
			sum += i;
			i += 2;
		}
		System.out.println("Сумма всех нечетных чисел в диапазоне от 1 до 99 включительно = " + sum);

	}

}
