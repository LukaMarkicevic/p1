import java.util.*;
import java.lang.Math;

public class Ulomek {
	int a;
	int b;

	public static int gcd(int a, int b) {
		if (b < 0) {
			b = -b;
		}
		if (a < 0) {
			a = -a;
		}
		while (b > 0) {
			int t = a;
			a = b;
			b = t % b;
		}
		return a;
	}

	public Ulomek(int a, int b) {
		if (b < 0) {
			b = -b;
			a = -a;
		}
		// System.out.println(gcd(a, b));
		if (gcd(a, b) != 1) {
			int z = gcd(a, b);
			a = a / z;
			b = b / z;
		}

		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", this.a, this.b);
	}

	public boolean jeEnakKot(Ulomek u) {
		return (this.a == u.a) && (this.b == u.b);
	}

	public Ulomek negacija() {
		// System.out.println(this.a);
		// System.out.println(-this.b);
		return new Ulomek(this.a, -this.b);
	}

	public Ulomek obrat() {
		return new Ulomek(this.b, this.a);
	}

	public Ulomek vsota(Ulomek u) {
		if (u.b == 1) {
			return new Ulomek(this.a + this.b * u.a, this.b);
		}
		if (this.b == 1) {
			return new Ulomek(u.a + u.b * this.a, u.b);
		}
		return new Ulomek(this.a * ((u.b * this.b) / this.b) + u.a * ((u.b * this.b) / u.b), u.b * this.b);
	}

	public Ulomek razlika(Ulomek u) {
		if (u.b == 1) {
			return new Ulomek(this.a - this.b * u.a, this.b);
		}
		if (this.b == 1) {
			return new Ulomek(-(u.a - u.b * this.a), u.b);
		}
		return new Ulomek(this.a * ((u.b * this.b) / this.b) - u.a * ((u.b * this.b) / u.b), u.b * this.b);
	}

	public Ulomek zmnozek(Ulomek u) {
		return new Ulomek(this.a * u.a, this.b * u.b);
	}

	public Ulomek kolicnik(Ulomek u) {
		return new Ulomek(this.a * u.b, this.b * u.a);
	}

	public Ulomek potenca(int eksponent) {
		if (eksponent < 0) {
			int c = (int) Math.pow(this.a, -eksponent);
			int d = (int) Math.pow(this.b, -eksponent);
			return new Ulomek(d, c);
		}
		int c = (int) Math.pow(this.a, eksponent);
		int d = (int) Math.pow(this.b, eksponent);
		return new Ulomek(c, d);
	}

	public boolean jeManjsiOd(Ulomek u) {
		if (u.b == 1) {
			return (this.a < u.a * this.b);
		}
		if (this.b == 1) {
			return (u.b * this.a < u.a);
		}
		int z = this.b * u.b;
		return (this.a * (z / this.b) < u.a * (z / u.b));
	}

}