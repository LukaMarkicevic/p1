public class Oseba {
	String ime;
	String priimek;
	char spol;
	int letoRojstva;
	Oseba oce;
	Oseba mati;
	static int steviloUstvarjenih = 0;

	public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
		this.ime = ime;
		this.priimek = priimek;
		this.spol = spol;
		this.letoRojstva = letoRojstva;
		this.oce = oce;
		this.mati = mati;
		steviloUstvarjenih++;
	}

	public String vrniIme() {
		return this.ime;
	}

	public String toString() {
		return this.ime + " " + this.priimek + " " + "(" + this.spol + ")," + " " + this.letoRojstva;
	}

	public int starost(int leto) {
		return leto - this.letoRojstva;
	}

	public boolean jeStarejsaOd(Oseba os) {
		return (os.letoRojstva > this.letoRojstva) ? true : false;
	}

	public String imeOceta() {
		try {
			return this.oce.ime;
		} catch (Exception e) {
			return "null";
		}
	}

	public boolean jeBratAliSestraOd(Oseba os) {
		if (os == this)
			return false;
		return (os.mati == this.mati) && (os.oce == this.oce) ? true : false;
	}

	public boolean jeSestraOd(Oseba os) {
		return ((os.mati == this.mati) && (os.oce == this.oce)) && (this.spol == 'Z') ? true : false;
	}

	public boolean jeTetaOd(Oseba os) {
		return (this.jeSestraOd(os.mati)) || (this.jeSestraOd(os.oce));
	}

	public boolean jeOcetovskiPrednikOd(Oseba os) {
		if (os == this)
			return false;
		while (os != this) {
			os = os.oce;
			if (os == null) {
				return false;
			}

		}
		return true;
	}

	public static int steviloUstvarjenih() {
		return steviloUstvarjenih;
	}
}