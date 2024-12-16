import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("**** Bem-vindo ao Jogo do Adivinha! ****");
        System.out.println("****************************************");
        System.out.println(" ");

        System.out.print("Informe o número de partidas que deseja jogar nessa rodada: ");
        int vezesPartida = input.nextInt();
        System.out.println(" ");

        int rodada = 1;
        System.out.println("**** Vamos começar a rodada nª " + rodada + " ****");

        int pontuacaoTotal = 0;

        for (int i = vezesPartida; i > 0 ; i--) {

            int pontos = 0;

            Random geradorNumerosAleatorios = new Random();
            int numeroSorteado = geradorNumerosAleatorios.nextInt(11);

            System.out.println(" ");
            System.out.print("Escreva aqui o seu número palpite: ");
            int numeroPalpite = input.nextInt();
            System.out.println("Número sorteado pelo sistema: " + numeroSorteado);

            if (numeroPalpite == numeroSorteado){
                pontos = 10;
                System.out.println("Parabéns! Você acertou o número e ganhou 10 pontos!");
            } else if (numeroPalpite == (numeroSorteado + 1) || numeroPalpite == (numeroSorteado - 1)) {
                pontos = 5;
                System.out.println("Quase lá! Você ficou a 1 de distância do número sorteado e ganhou 5 pontos!");
            } else {
                System.out.println("Seu palpite está errado, por isso não ganhou pontos.");
            }

            pontuacaoTotal = pontuacaoTotal + pontos;
        }

        System.out.println(" ");
        System.out.println("**** Sua pontuação na rodada nª " + rodada + " é de " + pontuacaoTotal + " pontos. ****");

       /* if (i == 0) {

        }*/

    }
}
