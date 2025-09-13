package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai27 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a = 1, b = 1;
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            int temp = a + b;
	            a = b;
	            b = temp;}

	}

}
