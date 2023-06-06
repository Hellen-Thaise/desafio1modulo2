//  Você deve gerar um número aleatório e comparar com a resposta vinda do usuário.
//  Caso seja o mesmo número o usuário ganha 10 pontos, caso seja número diferente o programa deve comparar para saber
//  se o número está 1 acima ou 1 abaixo do número sorteado, caso esteja o usuário ganha 5 pontos, caso não esteja o
//  usuário apenas perde. No fim deverá ser exibida a pontuação do usuário. Tudo via console.
//  Entrega Mínima: O sistema sorteia o número e realiza todas as comparação, no final ele exibe a pontuação correta.
//  Entrega Média: O sistema permite jogar mais de uma vez e soma todas as pontuações.
//  Entrega Máxima: O sistema permite adicionar nível de dificuldade de alguma forma e exibe, além da pontuação,
//  os números que o usuário errou e acertou.

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class desafio {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner entrada_do_usuario = new Scanner(System.in);
        int msgSaida = 0;
        int pontuacaoFinal = 0;

        //criando arrayList
        ArrayList<Integer> jogadaUsuario = new ArrayList<>();
        ArrayList<Integer> jogadaPonto = new ArrayList<>();
        System.out.println("\nJogo de adivinhação");
        System.out.println("------------------------------------------------------");


        while (msgSaida == 0) {

            System.out.println("Digite um número de 0 a 10: ");
            int numero = entrada_do_usuario.nextInt();

            int numero1 = numero + 1;
            int numero2 = numero - 1;
            int pontuacao = 0;
            int jogadas = 0;

            jogadaUsuario.add(numero);

            //utilizando o Random para gerar números aleatórios
            int numeroInteiroAleatorio_0_a_10 = random.nextInt(10 );
            System.out.println("O número soteado pelo computador foi: " + numeroInteiroAleatorio_0_a_10);

            if (numeroInteiroAleatorio_0_a_10 == numero) {
                pontuacaoFinal = pontuacaoFinal + 10;
                jogadas = jogadas + 1;
                pontuacao = 10;
                jogadaPonto.add(pontuacao);
                System.out.println("Parabéns, você ganhou 10 PONTOS");

            } else if (numeroInteiroAleatorio_0_a_10 == numero1 || numeroInteiroAleatorio_0_a_10 == numero2) {
                pontuacaoFinal = pontuacaoFinal + 5;
                jogadas = jogadas + 1;
                pontuacao = 5;
                jogadaPonto.add(pontuacao);
                System.out.println("Você ganhou 5 PONTOS");
            } else {

                jogadas = jogadas + 1;
                pontuacao = 0;
                jogadaPonto.add(pontuacao);
                System.out.println("Você não somou pontos!");
            }

            System.out.println("\nTecle [1] para SAIR e [0] para CONTINUAR");
            msgSaida = entrada_do_usuario.nextInt();

            if (msgSaida > 1) {
                msgSaida = 0;
            } else if (msgSaida < 1) {
                msgSaida = 0;
            }

            System.out.println("Você jogos os seguinter números: " + jogadaUsuario);

            }
            System.out.println("Sua pontuação final foi: " + pontuacaoFinal + " pontos");
    }

}