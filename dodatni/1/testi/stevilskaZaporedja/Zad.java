import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		if (k == 0 || ((a < b) && (k < 0)) || ((a > b) && (k > 0))) {
			System.out.println("NAPAKA");
			System.exit(0);
		}

		if (a <= b) {
			if (a == b) {
				System.out.printf("%d\n", a);
				System.exit(0);
			}
			for (int i = a; i <= b; i = i + k) {
				System.out.printf("%d\n", i);
			}
			System.exit(0);
		}
		if (a > b) {
			for (int i = a; i >= b; i = i + k) {
				System.out.printf("%d\n", i);
			}
			System.exit(0);
		}



	}
}