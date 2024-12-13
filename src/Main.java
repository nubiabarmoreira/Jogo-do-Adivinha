import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int pontuacaoTotal = 0;

        Random geradorNumerosAleatorios = new Random();
        int numeroSorteado = geradorNumerosAleatorios.nextInt(11);

        System.out.println("****************************************");
        System.out.println("**** Bem-vindo ao Jogo do Adivinha! ****");
        System.out.println("****************************************");
        System.out.println(" ");

        System.out.print("Escreva aqui o seu número palpite: ");
        int numeroPalpite = input.nextInt();
        System.out.println("Número sorteado pelo sistema: " + numeroSorteado);
        System.out.println(" ");

        if (numeroPalpite == numeroSorteado){
            pontuacaoTotal = pontuacaoTotal + 10;
            System.out.println("Parabéns! Você acertou o número e ganhou 10 pontos!");
        } else if (numeroPalpite == (numeroSorteado + 1) || numeroPalpite == (numeroSorteado - 1)) {
            pontuacaoTotal = pontuacaoTotal + 5;
            System.out.println("Quase lá! Você ficou a 1 de distância do número sorteado e ganhou 5 pontos!");
        } else {
            System.out.println("Seu palpite está errado, por isso não ganhou pontos.");
        }

        System.out.println("Sua pontuação é de " + pontuacaoTotal + " pontos.");
    }
}