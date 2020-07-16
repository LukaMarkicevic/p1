import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();

		System.out.printf("%d", (a < 0) ? -a : a);

	}
}