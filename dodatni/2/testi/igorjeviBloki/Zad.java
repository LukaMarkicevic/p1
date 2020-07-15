import java.util.*;

public class Zad {

	static void ispisi(int a) {
		for (int i = 0; i < a; i++) {
			System.out.printf("%d", a);
		}

	}

	static void razmak(int a) {
		for (int i = 0; i < a; i++) {
			System.out.printf(" ");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//naci max
		int max = 0;
		if (a >= b && a >= c) {
			max = a;
		}
		if (b > a && b > c) {
			max = b;
		}
		if (c > a && c > b) {
			max = c;
		}

		int sum = a + b + c;

		int gotov1 = 0;
		int gotov2 = 0;
		int gotov3 = 0;

		for (int i = 0; i < max; i++) {
			if (gotov1 == a) {
				razmak(a);
			} else {
				ispisi(a);
				gotov1++;
			}
			if (gotov2 == b&&gotov3==c) {
				System.out.printf("\n");
				continue;
			}
			System.out.printf(" ");
			if (gotov2 == b) {
				razmak(b);
			} else {
				ispisi(b);
				gotov2++;
			}
			if (gotov3 == c) {
				System.out.printf("\n");
				continue;
			}
			System.out.printf(" ");
			if (gotov3 == c) {
				razmak(c);
			} else {
				ispisi(c);
				gotov3++;
			}
			System.out.printf("\n");
		}


	}
}