package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai29a {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt(); // dòng
	        int n = sc.nextInt(); // cột
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
