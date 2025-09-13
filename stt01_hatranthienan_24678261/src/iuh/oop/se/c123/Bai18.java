package iuh.oop.se.c123;

public class Bai18 {

	public static void main(String[] args) {
		for (int i = 2; i < 300; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    

	}

}
