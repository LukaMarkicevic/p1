import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int maxClanova = 0, maxBroj = 0;
		for (int i = a; i <= b; i++) {
			int broj = i;
			int stClanova = 0;
			while (broj != 1) {
				if (broj % 2 == 0) {
					broj /= 2;
				} else {
					broj = 3 * broj + 1;
				}
				stClanova++;
			}

			if (stClanova > maxClanova) {
				maxClanova = stClanova;
				maxBroj = i;
			}
		}
		System.out.printf("%d\n", maxBroj);
		System.out.printf("%d\n", maxClanova + 1);
	}
}