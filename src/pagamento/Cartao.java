package pagamento;

public class Cartao{
    // Aqui, essa classe trata das informações básicas do
    // cartão do cliente que devem ser repassadas para as
    // interfaces. A Interface Operadora é quem vai dizer
    // se a compra desse cartão é válida ou não

    private String nomeDoCliente;
    private String numeroCartao;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

}
