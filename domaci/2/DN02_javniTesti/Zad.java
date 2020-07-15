import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int count;
		switch (n) {
		case 1:
			count = 0;
			for (int i = a; i <= b; i++) {
				if (i % k == 0) {
					count++;
				}
			}
			System.out.printf("%d\n", count);
			break;
		case 2:
			count = 0;
			for (int i = a; i <= b; i++) {
				int broj = i;
				while (broj != 0) {
					int mod = broj % 10;
					broj -= mod;
					broj /= 10;
					if (mod == k) {
						count++;
						break;
					}
				}
			}
			System.out.printf("%d\n", count);

			break;
		case 3:
			count = 0;
			boolean jeste;
			for (int i = a; i <= b; i++) {
				int broj = i;
				jeste = true;
				while (broj != 0) {
					int mod = broj % 10;
					broj -= mod;
					broj /= 10;
					if (mod == 0) continue;
					if (mod % k != 0) {
						jeste = false;
						break;
					}
				}
				if (jeste) {
					count++;
				}
			}
			System.out.printf("%d\n", count);

			break;
		case 4:
			count = 0;


			for (int i = a; i <= b; i++) {
				int broj = i;
				int incount = 0;
				String duzina = Integer.toString(broj);
				char[] pBroj = duzina.toCharArray();
				

				for (int j = 0; j < duzina.length(); j++) {
					// System.out.printf("%s\n",duzina);
					if (j == (duzina.length() - 1)) break;
					if (pBroj[j] != pBroj[j + 1]) {

						continue;
					}
					incount++;

					if (incount == k - 1) {

						count++;
						break;
					}
				}

			}
			System.out.printf("%d\n", count);
			break;
		case 5:
			// code block
			break;

		}

	}
}