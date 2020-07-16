
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek; x <= konec; x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = interval.vrniZacetek(); i <= interval.vrniKonec(); i++) {
            if (y(i) == null)
                continue;
            if (y(i) > max) {
                max = y(i);
            }
            if (y(i) < min) {
                min = y(i);
            }
        }

        return new Interval(min, max);
    }

    public boolean jeMonotono(Interval interval) {
        return this.jeMonotono(interval, 1) || this.jeMonotono(interval, -1);
    }

    private boolean jeMonotono(Interval interval, int smer) {
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        Integer yp = null;

        for (int x = zacetek; x <= konec; x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (yp != null && smer * y <= smer * yp) {
                    return false;
                }
                yp = y;
            }
        }
        return true;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
        if (!this.jeMonotono(interval)) {
            return null;
        }
        return new Inverz(this, interval);
    }
}
