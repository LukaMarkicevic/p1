import java.util.*;

public class Zad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> broj = new ArrayList<Integer>();
		Integer[] vrni = new Integer[n];

		for (int i = 0; i < n; i++) {
			vrni[i] = 0;
		}
		while (sc.hasNextInt()) {
			broj.add(sc.nextInt());
		}

		int disk = 1;
		for (int i = 0; i < broj.size(); i++) {

			// nadji indeks najmanjeg elementa u array
			ArrayList<Integer> velicina = new ArrayList<Integer>(Arrays.asList(vrni));
			int indeks = velicina.indexOf(Collections.min(velicina));
			disk = indeks + 1;	
			vrni[indeks] += broj.get(i);
			if (vrni[indeks] > k) {
				break;
			}

			System.out.printf("%d EP -> zgoscenka %d %s\n", broj.get(i), disk, Arrays.toString(vrni));
		}



	}
}