package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        boolean allDigit = true;
	        for (char c : s.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                allDigit = false;
	                break;
	            }
	        }
	        System.out.println(allDigit ? "Chuỗi toàn số" : "Chuỗi không chỉ toàn số");

	}

}
