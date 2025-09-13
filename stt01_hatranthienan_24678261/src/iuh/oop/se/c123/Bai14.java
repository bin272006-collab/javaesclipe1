package iuh.oop.se.c123;

public class Bai14 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) sum += i;
        } else {
            for (int i = 1; i <= n; i += 2) sum += i;
        }
        System.out.println("Tổng = " + sum);

	}

}
