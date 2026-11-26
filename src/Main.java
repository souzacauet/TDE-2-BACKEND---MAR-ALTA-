public class Main {

    public static void main(String[] args) {

        // Criacao dos quartos
        Quarto[] quartos = {
            new Quarto(101, 180),
            new QuartoLuxo(201, 300, 60),
            new Chale(301, 250, 2)
        };

        // Exibicao dos quartos
        System.out.println("=== POUSADA MARE ALTA ===");
        System.out.println("\n=== QUARTOS DISPONIVEIS ===");

        for (Quarto q : quartos) {
            q.exibir();
        }

        // Criacao dos itens cobraveis
        Cobravel[] itens = {
            new Reserva(quartos[1], 3),
            new Passeio("Lencois Maranhenses", 150, 2),
            new Passeio("Rio Preguicas", 90),
            new Restaurante("Prato executivo", 35, 2),
            new Restaurante("Suco natural", 12, 2)
        };

        // Criacao da conta
        Conta conta = new Conta("Bruno Costa", itens);

        // Impressao do extrato
        System.out.println("\n=== EXTRATO DA CONTA ===");
        conta.imprimirExtrato();

        // Aplicacao de desconto
        System.out.println("\n=== DESCONTO ===");
        System.out.println(
            "Com cupom de 10%: R$ " + conta.calcularTotal(10)
        );
    }
}