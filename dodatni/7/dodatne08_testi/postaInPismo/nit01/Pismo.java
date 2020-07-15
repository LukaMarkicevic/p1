import java.util.*;

public class Pismo {
	Posta izvorna;
	Posta ciljna;
	boolean jePriporoceno;
	int razdalja;
	static int r;
	static int c;
	static int p;

	public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja) {
		this.izvorna = izvorna;
		this.ciljna = ciljna;
		this.jePriporoceno = jePriporoceno;
		this.razdalja = razdalja;
	}

	@Override
	public String toString() {
		return String.format("%d %s -> %d %s (%d km) [%c]", this.izvorna.stevilka, this.izvorna.naziv,
				this.ciljna.stevilka, this.ciljna.naziv, this.razdalja, (jePriporoceno) ? 'P' : 'N');
	}

	public boolean izviraOd(Posta posta) {
		return (posta == this.izvorna) ? true : false;
	}

	public boolean staIzvorInCiljIsta() {
		return (this.ciljna.naziv == this.izvorna.naziv) && (this.ciljna.stevilka == this.izvorna.stevilka);
	}

	public boolean imaIstiCiljKot(Pismo pismo) {
		return (this.ciljna == pismo.ciljna);
	}

	public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
		return (p1.ciljna == p2.ciljna);
	}

	public int cena() {
		int z = 1;
		for (int i = 0; i < 1000; i = z * r - 1) {
			if (razdalja <= i) {
				return z * c + ((jePriporoceno) ? p : 0);
			}
			z++;
		}
		return 0;
	}

	public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina) {
		r = enotaRazdalje;
		c = enotaCene;
		p = priporocnina;
	}

	public boolean jeDrazjeOd(Pismo pismo) {
		return (this.cena() > pismo.cena());
	}

	public static Pismo vrniDrazje(Pismo p1, Pismo p2) {
		return (p1.cena() > p2.cena()) ? p1 : p2;
	}

	public Pismo izdelajPovratno() {
		return new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
	}

}