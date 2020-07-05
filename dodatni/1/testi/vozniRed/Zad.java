import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int d = sc.nextInt();

		int a = h1 * 60 + m1;
		int b = h2 * 60 + m2;

		while (a <= b) {
			int sat = a / 60;
			int min = a - sat * 60;
			System.out.printf("%02d:%02d\n", sat, min);
			a += d;
		}

	}
}