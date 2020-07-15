import java.util.*;

public class Zad {

	static void izpisi(int a, int b) {
		while (b > 0) {
			if (a == 10) {
				a = 0;
			}
			b--;
			System.out.printf("%d", a);
			a++;
		}
		System.out.printf("\n");
	}


	static void razmak(int a) {
		for (int i = 0; i < a; i++) {
			System.out.printf(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int kopija = n - 1;
		int prviBroj = 1;
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			razmak(kopija--);
			izpisi(prviBroj, temp);
			temp += 2;
			prviBroj++;
			if (prviBroj == 10) {
				prviBroj = 0;
			}
		}


	}
}