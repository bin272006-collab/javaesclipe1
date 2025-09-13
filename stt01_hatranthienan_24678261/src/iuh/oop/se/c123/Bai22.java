package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai22 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(isPrime(n) ? "Nguyên tố" : "Không nguyên tố");
	    }
	    static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i * i <= n; i++)
	            if (n % i == 0) return false;
	        return true;

	}

}
