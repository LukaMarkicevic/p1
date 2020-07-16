import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int a = sc.nextInt();
		int c = sc.nextInt();
		
		int broj;
		if ((a <= b || a <= c) && ((a >= b) || (a >= c))) {
			System.out.printf("%d\n", a);
			System.exit(0);
		}
		if ((b <= a || b <= c) && ((b >= a) || (b >= c))) {
			System.out.printf("%d\n", b);
			System.exit(0);
		}
		if ((c <= a || c <= b) && ((c >= a) || (c >= b))) {
			System.out.printf("%d\n", c);
			System.exit(0);
		}

	}
}