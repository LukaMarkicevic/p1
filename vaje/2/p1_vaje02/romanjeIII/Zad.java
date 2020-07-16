import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int z = sc.nextInt();
		boolean prvi = true;

		int indeks = 1;
		for (int i = a; i > 0; i = i - b) {

			if (prvi) {
				prvi = false;
				System.out.printf("%d. dan: %d -> %d (prehodil %d)\n", indeks, i, ((i - b) < 0) ? 0 : (i - b), ((i - b) < 0) ? i : b);
				indeks++;
				continue;
			}
			b = b - z;
			if (b <= 0) {
				break;
			}
			System.out.printf("%d. dan: %d -> %d (prehodil %d)\n", indeks, i, ((i - b) < 0) ? 0 : (i - b), ((i - b) < 0) ? i : b);
			indeks++;
			

		}




	}
}