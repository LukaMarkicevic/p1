import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int brojJedan = 0;
		int brojDva = 0;
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a == 1) {

				brojJedan++;
				continue;
			}
			brojJedan--;
			if (brojJedan < 0) {
				System.out.println("BANKROT");
				System.exit(0);
			}

			brojDva++;

		}
		System.out.printf("%d\n", brojJedan);
		System.out.printf("%d", brojDva);

	}
}