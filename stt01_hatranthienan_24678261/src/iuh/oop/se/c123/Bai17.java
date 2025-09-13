package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai17 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập số nguyên: ");
	        int n = sc.nextInt();
	        if (n == 0) System.out.println("Số 0");
	        else if (n % 2 == 0) System.out.println("Số chẵn");
	        else System.out.println("Số lẻ");
	    }
}
