import java.util.*;

public class Kolatz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int count = 0;
		while (a != 1) {
			count++;
			if (a % 2 == 0) {
				a /= 2;
				continue;
			}
			a = 3 * a + 1;
		}
		System.out.printf("%d\n",count+1);

	}
}