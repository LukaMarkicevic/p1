public class Vsota extends Zaporedje {
    private Zaporedje prvo;
    private Zaporedje drugo;

    public Vsota(Zaporedje prvo, Zaporedje drugo) {
        this.prvo = prvo;
        this.drugo = drugo;
    }

    @Override
    public Integer y(int x) {
        Integer a = this.prvo.y(x);
        Integer b = this.drugo.y(x);
        if (a == null || b == null) {
            return null;
        }
        return (a + b);
    }

}