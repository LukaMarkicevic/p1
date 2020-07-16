import java.util.*;

public class Zad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		ArrayList<Integer> visine = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			visine.add(a);
		}

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (visine.get(i + 1) >= visine.get(i)) {
					count++;
					System.out.printf("%d\n", i);
				}
				continue;
			}
			if (i == (n - 1)) {
				if (visine.get(i - 1) <= visine.get(i)) {
					count++;
					System.out.printf("%d\n", i);
				}
				break;
			}
			if (visine.get(i - 1) <= visine.get(i) && visine.get(i + 1) >= visine.get(i)) {
				count++;
				System.out.printf("%d\n", i);
			}
		}
		if (count == 0) {
			System.out.println("NOBEDEN");
		}

	}
}