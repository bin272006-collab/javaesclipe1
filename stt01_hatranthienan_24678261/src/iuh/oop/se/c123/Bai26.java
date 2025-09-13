package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai26 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(), count = 0, num = 2, sum = 0;
	        while (count < n) {
	            if (isPrime(num)) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }
	        System.out.println("Tổng = " + sum);
	    }
	    static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i * i <= n; i++)
	            if (n % i == 0) return false;
	        return true;
	}

}
