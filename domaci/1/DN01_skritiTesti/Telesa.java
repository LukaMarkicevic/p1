import java.util.*;

public class Telesa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a, b, c;
		int ret = 0;
		switch (n) {
		case 1:
			a = sc.nextInt();
			System.out.printf("%d\n", a * a * a);
			break;
		case 2:
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.printf("%d\n", a * b * c);
			break;
		case 3:
			a = sc.nextInt();

			while (a != 1) {
				ret += a * a;
				a--;
			}
			System.out.printf("%d\n", ret + 1);
			break;
		case 4:
			a = sc.nextInt();
			b = sc.nextInt();

			while (a != 1) {
				ret += a * b;
				a--;
			}
			System.out.printf("%d\n", ret + b);
			break;
		case 5:
			a = sc.nextInt();

			while (a != 1) {
				ret += 4 * a - 4;
				a--;
			}
			System.out.printf("%d\n", ret + 1);
			break;
		case 6:
			a = sc.nextInt();
			b = sc.nextInt();

			while (a != 1) {
				ret += 2 * a + 2 * b - 4;
				a--;
			}
			System.out.printf("%d\n", ret + b);

			break;

		}


	}
}