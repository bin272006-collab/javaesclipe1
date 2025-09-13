package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai25 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(), sum = 0;
	        for (int i = 2; i < n; i++) if (isPrime(i)) sum += i;
	        System.out.println("Tổng = " + sum);
	    }
	    static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i * i <= n; i++)
	            if (n % i == 0) return false;
	        return true;

	}

}
