package iuh.oop.se.c123;

public class Bai16 {

	public static void main(String[] args) {
	        double a = Double.parseDouble(args[0]);
	        double b = Double.parseDouble(args[1]);
	        if (a == 0) {
	            if (b == 0) System.out.println("Vô số nghiệm");
	            else System.out.println("Vô nghiệm");
	        } else {
	            System.out.println("Nghiệm x = " + (-b / a));
	        }
	}

}
