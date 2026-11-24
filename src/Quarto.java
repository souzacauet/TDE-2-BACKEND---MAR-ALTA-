
public class Quarto {

    private int numero;
    private double diariaBase;

    // Construtor
    public Quarto(int numero, double diariaBase) {
        this.numero = numero;
        this.diariaBase = diariaBase;
    }

    // Calcula a diaria do quarto
    public double calcularDiaria() {
        return diariaBase;
    }

    // Exibe as informacoes do quarto
    public void exibir() {
        System.out.println("Quarto " + numero + ": R$ " 
                + calcularDiaria() + " por noite");
    }
}
