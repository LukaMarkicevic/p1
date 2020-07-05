import java.util.*;

public class Stevk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long mod;
		while (a != 0) {
			mod = a % 10;
			a = a - mod;
			a /= 10;
			System.out.printf("%d\n", mod);
		}

	}
}