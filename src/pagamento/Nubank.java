package pagamento;

public class Nubank implements Operadora{
    @Override
    public boolean autorizar(Autorizacao autorizacao, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") && autorizacao.getValorCompra() < 500;
    }
}
