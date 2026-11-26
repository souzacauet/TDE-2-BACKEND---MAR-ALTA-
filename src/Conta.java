public class Conta {

    private String hospede;
    private Cobravel[] itens;

    public Conta(String hospede, Cobravel[] itens) {
        this.hospede = hospede;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (Cobravel item : itens) {
            total += item.calcularValor();
        }

        return total;
    }

    public double calcularTotal(double descontoPercentual) {
        double total = calcularTotal();

        return total - (total * descontoPercentual / 100);
    }

    public void imprimirExtrato() {
        System.out.println("Hospede: " + hospede);
        System.out.println("\n=== ITENS DA CONTA ===");

        for (Cobravel item : itens) {
            System.out.println(item.descricao());
            System.out.println("Valor: R$ " + item.calcularValor());
        }

        System.out.println("\nTotal: R$ " + calcularTotal());
    }
}