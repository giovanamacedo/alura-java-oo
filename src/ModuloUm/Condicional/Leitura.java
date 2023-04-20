package ModuloUm.Condicional;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme preferido: ");
        String filme = scanner.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = scanner.nextInt();
        System.out.println("Qual sua avaliação do filme?");
        double avaliacao = scanner.nextDouble();
        System.out.println("Seu filme preferido é: " + filme + " de " + anoLancamento);
        System.out.println("Sua avaliação do filme foi: " + avaliacao);
    }
}
