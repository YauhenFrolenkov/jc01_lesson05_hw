package edu.training.jc.tasks.branching;

public class Task_10 {

	public static void main(String[] args) {
		double r1 = 10.5;
		double r2 = 14.5;
		double p = Math.PI;

		double S1 = p * Math.pow(r1, 2);
		double S2 = p * Math.pow(r2, 2);

		if (S1 < S2) {
			System.out.println("Площадь первого круга меньше");
		} else if (S1 > S2) {
			System.out.println("Площадь второго круга меньше");
		} else {
			System.out.println("Площади равны");
		}

	}

}
