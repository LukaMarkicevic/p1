import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long broj = 1;

		while (b > 0) {

			broj = broj * a;
			b--;
		}
		System.out.printf("%d\n", broj);


	}
}