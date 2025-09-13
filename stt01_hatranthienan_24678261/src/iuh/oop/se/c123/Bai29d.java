package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai29d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // chiều cao
        for (int i = 1; i <= n; i++) {
            // in khoảng trắng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // in *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
