import java.util.*;

public class Zad {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int ukupno = 0;
		int broj = 1;
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			ukupno += a;
			if (ukupno > k) {
				broj++;
				ukupno = a;
			}
			if (broj > n) {
				break;
			}
			System.out.printf("%d EP  -> zgoscenka %d (%d EP)\n", a, broj, ukupno);


		}


	}
}