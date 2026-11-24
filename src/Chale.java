
public class Chale extends Quarto {
    private int hospedesExtras;

    public Chale(int numero, double diariaBase, int hospedesExtras) {
        super(numero, diariaBase);
        this.hospedesExtras = hospedesExtras;
    }

    @Override
    public double calcularDiaria() {
        return super.calcularDiaria() + (45 * hospedesExtras);
    }
}