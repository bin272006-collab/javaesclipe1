package iuh.oop.se.c123;

import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int lower = 0, upper = 0, digit = 0, space = 0;
	        for (char c : s.toCharArray()) {
	            if (Character.isLowerCase(c)) lower++;
	            else if (Character.isUpperCase(c)) upper++;
	            else if (Character.isDigit(c)) digit++;
	            else if (Character.isWhitespace(c)) space++;
	        }
	        System.out.println("Thường: " + lower + " | Hoa: " + upper +
	                           " | Số: " + digit + " | Trắng: " + space);

	}

}
