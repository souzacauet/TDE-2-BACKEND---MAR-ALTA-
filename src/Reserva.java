public class Reserva implements Cobravel {

    private Quarto quarto;
    private int noites;

    public Reserva(Quarto quarto, int noites) {
        this.quarto = quarto;
        this.noites = noites;
    }

    @Override
    public String descricao() {
        return "Reserva do quarto " + quarto.getNumero()
                + " (noites: " + noites + ").";
    }

    @Override
    public double calcularValor() {
        return quarto.calcularDiaria() * noites;
    }
}