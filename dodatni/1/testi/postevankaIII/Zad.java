import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 1;
		int rez = i * a;
		while (rez <= b) {
			System.out.printf("%d * %d = %d\n", a, i, rez);
			i++;
			rez = i * a;
		}




	}
}