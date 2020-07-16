import java.util.*;

public class Datum {
	int dan;
	int mesec;
	int leto;

	public static Datum ustvari(int dan, int mesec, int leto) {
		if (leto < 1583 || leto > 2999 || mesec < 1 || mesec > 12 || dan < 1 || dan > 31)
			return null;
		boolean prestopno = false;
		if (leto % 400 == 0 || (leto % 4 == 0 && leto % 100 != 0)) {
			prestopno = true;
		}
		if ((mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) && (dan == 31))
			return null;
		if ((!prestopno && mesec == 2) && (dan > 28))
			return null;
		return new Datum(dan, mesec, leto);

	}

	private Datum(int dan, int mesec, int leto) {
		this.dan = dan;
		this.mesec = mesec;
		this.leto = leto;
	}

	@Override
	public String toString() {
		return String.format("%02d.%02d.%d", dan, mesec, leto);
	}

	public boolean jeEnakKot(Datum datum) {
		return this.dan == datum.dan && this.mesec == datum.mesec && this.leto == datum.leto;
	}

	public boolean jePred(Datum datum) {
		return this.leto < datum.leto || this.mesec < datum.mesec || this.dan < datum.dan;
	}

	public Datum naslednik() {
		if (this.dan == 31 && this.mesec == 12 && this.leto == 2999)
			return null;

		boolean prestopno = false;
		if (leto % 400 == 0 || (leto % 4 == 0 && leto % 100 != 0)) {
			prestopno = true;
		}
		if (mesec == 2) {
			if (this.dan == 28 && prestopno)
				return new Datum(29, mesec, leto);
			if (this.dan == 28 && !prestopno)
				return new Datum(1, mesec + 1, leto);
			if (this.dan == 29 && prestopno)
				return new Datum(1, mesec + 1, leto);
			if (this.dan == 29 && !prestopno)
				return new Datum(1, mesec + 1, leto);
		}
		if (this.dan == 30 && (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11))
			return new Datum(1, mesec + 1, leto);
		if (this.dan == 31 && (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10))
			return new Datum(1, mesec + 1, leto);
		if (this.dan == 31 && mesec == 12)
			return new Datum(1, 1, leto + 1);
		return new Datum(dan + 1, mesec, leto);
	}

	public Datum predhodnik() {
		if (this.dan == 1 && this.mesec == 1 && this.leto == 1583)
			return null;
		if (this.dan == 1 && (mesec - 1 == 4 || mesec - 1 == 6 || mesec - 1 == 9 || mesec - 1 == 11))
			return new Datum(30, mesec - 1, leto);
		if (this.dan == 1 && (mesec - 1 == 2)) {
			boolean prestopno = false;
			if (leto % 400 == 0 || (leto % 4 == 0 && leto % 100 != 0)) {
				prestopno = true;
			}
			return new Datum((prestopno ? 29 : 28), mesec - 1, leto);
		}
		if (this.dan == 1 && (mesec - 1 == 1 || mesec - 1 == 3 || mesec - 1 == 5 || mesec - 1 == 7 || mesec - 1 == 8
				|| mesec - 1 == 10))
			return new Datum(31, mesec + 1, leto);
		if (this.dan == 1 && mesec - 1 <= 0)
			return new Datum(31, 12, leto - 1);
		return new Datum(dan - 1, mesec, leto);

	}

	public int razlika(Datum datum){
		boolean prestopno = false;
		if (leto % 400 == 0 || (leto % 4 == 0 && leto % 100 != 0)) {
			prestopno = true;
		}
	}

}