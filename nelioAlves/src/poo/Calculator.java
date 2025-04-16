package poo;

public class Calculator {
//	Classe estática só pode ter métodos estáticos e não pode ser instanciada, ela é usada diretamente
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return (4 * PI * Math.pow(radius, 3)) / 3;
	}
}
