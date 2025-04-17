package memoriaArraysListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		
//		double[] vect = new double[n];
//		
//		for(int i = 0; i < n; i++) {
//			double height = sc.nextDouble();
//			vect[i] = height;
//		};
//		
//		double sum = 0;
//		for(int i = 0; i < n; i++) {
//			sum += vect[i];
//		};
//		
//		double mean = sum / vect.length;
//		
//		System.out.println(mean);
		
//		int n = sc.nextInt();
//		
//		Product[] vect = new Product[n];
//		
//		for (int i = 0; i < n; i++) {
//			String productName = sc.next();
//			double productPrice = sc.nextDouble();
//			
//			Product product = new Product(productName, productPrice);
//			vect[i] = product;
//		}
//		
//		double sum = 0;
//		for (int i = 0; i < n; i++) {
//			sum += vect[i].getPrice();
//		}
//		
//		double mean = sum / vect.length;
//		
//		System.out.println(mean);
		
//		double[] vect = new double[] {1.0, 2.3, 6.73};
//		
//		for(double i : vect) {
//			System.out.println(i);
//		}
		
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(13);
//		list.add(5);
//		list.add(76);
//		list.add(2, 8);
		
//		for(int x : list) {
//			System.out.println(x);
//		};
//		
//		System.out.println(list.size());
//		list.remove(1);
//		list.removeIf(x -> x < 10);
//		System.out.println(list.indexOf(13));
//		for(int x : list) {
//			System.out.println(x);
//		};
		
//		List<Integer> filteredList = list.stream().filter(x -> x < 10).collect(Collectors.toList());
//		for(int x : filteredList) {
//			System.out.println(x);
//		};
//		Integer number = filteredList.stream().filter(x -> x > 4).findFirst().orElse(null);
//		System.out.println(number);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			};
		};
		
		
		sc.close();
	}

}
