
public class QuartoLuxo extends Quarto {
    private double taxaLuxo;

    public QuartoLuxo(int numero, double diariaBase, double taxaLuxo) {
        super(numero, diariaBase);
        this.taxaLuxo = taxaLuxo;
    }

    @Override
    public double calcularDiaria() {
        return super.calcularDiaria() + taxaLuxo;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("  Inclui cafe da manha e frigobar");
    }
}
