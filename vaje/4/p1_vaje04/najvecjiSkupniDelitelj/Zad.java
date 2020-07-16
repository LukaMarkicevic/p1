import java.util.*;

public class Zad {

	public static int gcd(int a, int b) {
		while (b > 0) {
			int t = a;
			a = b;
			b = t % b;
		}
		return a;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int g = sc.nextInt();

		for (int i = g; i <= n; i = i + g) {
			for (int j = g; j <= n; j = j + g) {
				if (gcd(i, j) == g && (i <= j)) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}

	}
}