import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int indeks = 1;
		int najb = 1;
		while (n > 0) {
			int prvi = sc.nextInt();
			if (prvi == 0) {
				indeks++;
				n--;
				continue;
			}
			int drugi = sc.nextInt();


			if (drugi == 0) {
				indeks++;
				n--;
				continue;
			}
			int skupni = prvi + drugi;

			if (skupni < min) {
				min = skupni;
				najb = indeks;
			}
			indeks++;
			n--;
		}
		if (min == Integer.MAX_VALUE) {
			System.out.println("NIHCE");
		} else {
			System.out.printf("%d\n", najb);
			System.out.printf("%d\n", min);
		}


	}
}