
public class Quarto {
    private int numero;
    private double diariaBase;

    public Quarto(int numero, double diariaBase) {
        this.numero = numero;
        this.diariaBase = diariaBase;
    }

    public int getNumero() {
        return numero;
    }

    public double calcularDiaria() {
        return diariaBase;
    }

    public void exibir() {
        System.out.println("Quarto " + numero + ": R$ "
                + calcularDiaria() + " por noite");
    }
}
