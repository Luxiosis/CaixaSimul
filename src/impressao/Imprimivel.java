package impressao;

public interface Imprimivel {
    // Quero indicar o que pode ser impresso na impressora
    public String getCabecalhoNF();
    public String getCorpoNF();

    // Não importa quais são os dado imprimíveis, só preciso definir
    // quais "partes" são imprimíveis
}
