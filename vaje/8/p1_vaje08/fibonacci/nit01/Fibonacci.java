public class Fibonacci {
    int prviBroj;
    int drugiBroj;

    public Fibonacci(int prviBroj, int drugiBroj) {
        this.prviBroj = prviBroj;
        this.drugiBroj = drugiBroj;
    }

    public int naslednji() {
        int sum = prviBroj + drugiBroj;
        prviBroj = drugiBroj;
        drugiBroj = sum;
        return sum;
    }
}
