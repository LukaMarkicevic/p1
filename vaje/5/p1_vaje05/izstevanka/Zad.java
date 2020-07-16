import java.util.*;

public class Zad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		//Integer vrni[] = new Integer[n];
		ArrayList<String> otroci = new ArrayList<String>(n);
		for (int i = 0; i < n; i++) {
			otroci.add(sc.next());
		}


		while (n != 1) {

			int indeks = (k % n) - 1;

			if (indeks >= n) {
				indeks = indeks % n;
			}
			if (indeks < 0) {
				indeks = n + indeks;
			}


			System.out.printf("%s\n", otroci.get(indeks));
			otroci.remove(indeks);
			n--;
		}


	}
}