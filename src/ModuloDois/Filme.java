package ModuloDois;

public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    public Filme() {
    }

    public Filme(String nome, int anoLancamento, boolean incluidoPlano, double somaAvaliacoes, int totalAvaliacoes, int duracaoMinutos) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
        this.somaAvaliacoes = somaAvaliacoes;
        this.totalAvaliacoes = totalAvaliacoes;
        this.duracaoMinutos = duracaoMinutos;
    }

    public Filme(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public void avaliaFilme(double nota){
        this.somaAvaliacoes += nota;
        this.totalAvaliacoes++;
    }

    public double obterMedia(){
        return this.somaAvaliacoes / this.totalAvaliacoes;
    }

    @Override
    public String toString() {
        return "Filme: " +
                "Nome: " + nome + "\n" +
                "Ano de lancamento: " + anoLancamento + "\n" +
                "Incluido no plano: " + incluidoPlano + "\n" +
                "Avaliação: " + somaAvaliacoes + "\n" +
                "Total de avaliações: " + totalAvaliacoes + "\n" +
                "Duração em minutos: " + duracaoMinutos;
    }
}
