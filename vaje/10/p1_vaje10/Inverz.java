public class Inverz extends Zaporedje {

    // zaporedje, ki ga invertiramo
    private Zaporedje izhodisce;

    // interval, na katerem bomo iskali vrednost y za podani x
    // (oziroma x za podani y v izhodiscnem zaporedju)
    private Interval interval;

    public Inverz(Zaporedje izhodisce, Interval interval) {
        this.izhodisce = izhodisce;
        this.interval = interval;
    }

    @Override
    public Integer y(int x) {
        // sprehodimo se po intervalu this.interval in v izhodiscnem zaporedju
        // poiscemo tocko na abscisi, ki ustreza vrednosti kordinate x

        int zacetek = this.interval.vrniZacetek();
        int konec = this.interval.vrniKonec();
        for (int i = zacetek; i <= konec; i++) {
            Integer y = this.izhodisce.y(i);
            if (y != null && y == x) {
                return i;
            }
        }
        return null;
    }
}