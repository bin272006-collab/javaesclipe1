package iuh.oop.se.c123;

public class Bai28c {

	public static void main(String[] args) {
		 int n = 7; // nên chọn số lẻ
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == n / 2 || j == n / 2 || i == j || i + j == n - 1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	}

}
