package myFirstProgram;

import java.util.Scanner;

public class exercicio02Sequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		sc.close();
		System.out.printf("A=%.4f", area);
	}

}
