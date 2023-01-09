package pagamento;

public interface Operadora {
    // Não sei qual é a operadora do cartão,
    // só preciso saber se ela vai autorizar
    // a compra ou não

    public boolean autorizar(Autorizacao autorizacao, Cartao cartao);
}
