package impressao;
// Ela vai imprimir qualqer documento, não me interessando
// qual tipo de documento está sendo recebido. Todos os
// métodos das interfaces são abstratos e não possuem
// implementação aqui.

public interface Impressora {
    public void imprimir(Imprimivel imprimivel);
    // Este método vai servir para imprimir um documento
    // Que documento é esse? Ele vem da interface IMPRIMIVEL

}