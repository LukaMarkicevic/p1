import java.util.*;

public class Zad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();


		for (int i = a; i > 0; i = i - b) {
			System.out.printf("%d\n", i);
		}




	}
}


