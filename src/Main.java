import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroMinimo = 0;

        Random geradorNumerosAleatorios = new Random((10 - numeroMinimo) +1);

       /* List numbersList = new ArrayList() ;

        for (int i = 1 ; i >= 0 && i <= 10 ; i++){
            numbersList.add (new int [i]);
        }

        Collections.shuffle (numbersList) ;*/

        System.out.print("Escreva aqui o seu número palpite: ");
        int numeroPalpite = input.nextInt();
        int numeroSorteado = geradorNumerosAleatorios.nextInt(5);

        System.out.println("Número sorteado pelo sistema: " + numeroSorteado);
        System.out.println("Número palpite do usuário: " + numeroPalpite);


        System.out.println();

    }

}







// suffle() = mistura os elementos
// A sequencia aleatória é o processo implementado comumente em API de apoio em linguagens de programação e em Java é representado pela classe java.util.Random . Esta classe é o que se chama um Gerador de Números Aleatórios mas ele é de fato um gerador de sequências aleatórias.
