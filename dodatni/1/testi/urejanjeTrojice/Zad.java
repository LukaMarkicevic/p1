import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int a = sc.nextInt();
		int c = sc.nextInt();

		if (a <= b && a <= c) {
			System.out.printf("%d ", a);
			if (b <= c) {
				System.out.printf("%d ", b);
				System.out.printf("%d", c);
			} else {
				System.out.printf("%d ", c);
				System.out.printf("%d", b);
			}
			System.exit(0);
		}
		if (b <= a && b <= c) {
			System.out.printf("%d ", b);
			if (a <= c) {
				System.out.printf("%d ", a);
				System.out.printf("%d", c);
			} else {
				System.out.printf("%d ", c);
				System.out.printf("%d", a);
			}
			System.exit(0);
		}
		if (c <= a && c <= b) {
			System.out.printf("%d ", c);
			if (a <= b) {
				System.out.printf("%d ", a);
				System.out.printf("%d", b);
			} else {
				System.out.printf("%d ", b);
				System.out.printf("%d", a);
			}
			System.exit(0);
		}

	}
}