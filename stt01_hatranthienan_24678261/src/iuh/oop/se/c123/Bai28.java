package iuh.oop.se.c123;

public class Bai28 {

	public static void main(String[] args) {
		 int n = 7; // số dòng
	        int m = 7; // số cột
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (i == 0 || i == n - 1 || j == 0 || j == m - 1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	}

}
