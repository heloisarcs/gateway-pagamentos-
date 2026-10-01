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

    // Método concreto: reaproveitado por todas as filhas
    public void imprimirRecibo() {
        System.out.println("----- RECIBO -----");
        System.out.println("ID da transação: " + idTransacao);
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Status: " + status);
        System.out.println("------------------");
    }

    // Contrato: cada filha define como processa
    public abstract boolean processar();

    // Permite que o Gateway altere o status (os atributos são protected)
    public void setStatus(String status) {
        this.status = status;
    }
}