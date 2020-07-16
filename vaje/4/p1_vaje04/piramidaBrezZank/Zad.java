import java.util.*;

public class Zad {

	public static void zaporedje(char znak, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%c", znak);
		}
	}

	public static void vrstica(int vr, int visina) {
		zaporedje(' ', visina - vr);
		zaporedje('*', 2 * vr - 1);
		System.out.print('\n');
	}

	public static void piramida(int vr, int visina) {
		if (vr <= visina) {
			vrstica(vr, visina);
			piramida(vr + 1, visina);
		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		piramida(1, n);


	}
}