public class GatewayPagamento {

    public void realizarCobranca(Pagamento pagamento) {
        boolean sucesso = pagamento.processar(); // polimorfismo em ação

        if (sucesso) {
            pagamento.setStatus("APROVADO");
        } else {
            pagamento.setStatus("RECUSADO");
        }

        pagamento.imprimirRecibo();
    }
}