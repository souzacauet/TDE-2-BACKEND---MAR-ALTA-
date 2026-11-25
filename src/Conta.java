import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String hospede;
    private List<Cobravel> itens;

    public Conta(String hospede) {
        this.hospede = hospede;
        this.itens = new ArrayList<>();
    }

    public void adicionar(Cobravel item) {
        if (item != null) {
            itens.add(item);
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Cobravel item : itens) {
            total += item.calcularValor();
        }
        return total;
    }

    public void exibir() {
        System.out.println("=== Conta: " + hospede + " ===");
        for (Cobravel item : itens) {
            System.out.println("- " + item.descricao() + " R$ " + item.calcularValor());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    public String getHospede() {
        return hospede;
    }

    public List<Cobravel> getItens() {
        return itens;
    }
}