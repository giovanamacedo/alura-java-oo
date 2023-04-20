package ModuloUm.Condicional;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 1;


        while (numeroTentativas <= 5){
            System.out.println("Digite o número: ");
            int numero = scanner.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Você acertou!");
                break;
            }
            else if (numero < numeroAleatorio){
                System.out.println("Digite um número maior...");
            } else if (numero > numeroAleatorio) {
                System.out.println("Digite um número menor...");
            }
            if (numeroTentativas >= 5){
                System.out.println("Você não conseguiu.");
                break;
            }
            numeroTentativas++;
        }
    }
}
