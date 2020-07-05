import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int a = sc.nextInt();
		int bd = (a / b) * b;
		int bg = a + (b - (a % b));

		if ((bg - a) > (a - bd)) {
			System.out.printf("%d\n", bd);
			System.exit(0);
		} else if ((bg - a) < (a - bd)) {
			System.out.printf("%d\n", bg);
			System.exit(0);
		}

		System.out.printf("%d\n", (bg < bd) ? bg : bd);

	}
}