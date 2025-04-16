package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Triangle x, y;
//		x = new Triangle();
//		y = new Triangle();
//		
//		System.out.println("Measures of triangle x: ");
//		x.a = sc.nextDouble();
//		x.b = sc.nextDouble();
//		x.c = sc.nextDouble();
//		
//		System.out.println("Measures of triangle y: ");
//		y.a = sc.nextDouble();
//		y.b = sc.nextDouble();
//		y.c = sc.nextDouble();
//		
//		double areaX = x.areaCalc();
//		double areaY = y.areaCalc();
//		
//		System.out.printf("Triangle X area = %.4f%n", areaX);
//		System.out.printf("Triangle Y area = %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.printf("Largest X = %.4f", areaX);
//		}
//		else {
//			System.out.printf("Largest Y = %.4f", areaY);
//		}
		
		Product product;
		product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantitity in stock: ");
		product.stock = sc.nextInt();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", product.name, product.price, product.stock, product.totalValueInStock());
		
		System.out.print("Enter the number of products to be added: ");
		int addedProducts = sc.nextInt();
		product.addProducts(addedProducts);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f", product.name, product.price, product.stock, product.totalValueInStock());
		
		System.out.print("Enter the number of products to be removed: ");
		int removedProducts = sc.nextInt();
		product.removeProducts(removedProducts);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f", product.name, product.price, product.stock, product.totalValueInStock());
		
		sc.close();
	}

}
