package ModuloUm.Condicional;

public class MainCondicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que estão curtindo!");
        } else {
            System.out.println("Esse vale a pena assistir.");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Filme tá liberado");
        } else {
            System.out.println("Não tá liberado");
        }
    }
}
