package iuh.oop.se.c123;

public class Bai13 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Tổng = " + sum);
	}

}
