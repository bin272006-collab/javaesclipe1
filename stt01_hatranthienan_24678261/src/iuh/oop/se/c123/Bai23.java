package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("USCLN = " + gcd(a, b));
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;

	}

}
