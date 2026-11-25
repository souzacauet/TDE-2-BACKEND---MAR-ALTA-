
public class Restaurante implements Cobravel {

    private String nomeConsumo;
    private double precoUnitario;
    private int quantidade;

    public Restaurante(String nomeConsumo, double precoUnitario, int quantidade) {
        this.nomeConsumo = nomeConsumo;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    @Override
    public String descricao() {
        return "Consumo no restaurante: " + nomeConsumo
                + " (quantidade: " + quantidade + ").";
    }

    @Override
    public double calcularValor() {
        return precoUnitario * quantidade;
    }
}
