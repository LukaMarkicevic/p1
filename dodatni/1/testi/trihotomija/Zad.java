import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		if (a > b) {
			System.out.println("1");
			System.exit(0);
		} else if (a < b) {
			System.out.println("-1");
			System.exit(0);
		}
		System.out.println("0");
	}
}