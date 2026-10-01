import java.util.UUID;

public abstract class Pagamento {

    protected String idTransacao;
    protected double valor;
    protected String status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.idTransacao = "TRX-" + UUID.randomUUID();
        this.status = "PENDENTE";
    }

    // Mostra os dados do pagamento
    public void imprimirRecibo() {
        System.out.println("----- RECIBO -----");
        System.out.println("ID da transação: " + idTransacao);
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Status: " + status);
        System.out.println("------------------");
    }

    // Cada tipo de pagamento vai ter sua própria implementação
    public abstract boolean processar();

    // Atualiza o status do pagamento
    public void setStatus(String status) {
        this.status = status;
    }
}
