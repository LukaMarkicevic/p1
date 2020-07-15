import java.util.*;

public class Zad {

	static void izpisi(int a) {
		while (a > 0) {
			System.out.print('*');
			a--;
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
			izpisi(temp);
			temp += 2;
			

		}


	}
}