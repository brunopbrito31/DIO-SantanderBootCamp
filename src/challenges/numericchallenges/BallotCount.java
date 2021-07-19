package challenges.numericchallenges;

import java.util.Scanner;

public class BallotCount {

    //Enunciado ao final da página

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int valor = reader.nextInt();
        System.out.println(valor);
        separarNotas2(valor);
        reader.close();
    }
    public static void separarNotas2(int valor){
        int qt = 0, auxiliar = valor;
        int[] notasExistentes = {100,50,20,10,5,1};
        for(int x: notasExistentes){
            if (auxiliar >= x) {
                qt = auxiliar / x;
                System.out.println(qt + " nota(s) de R$ "+x+",00");
                auxiliar = auxiliar % x;
            } else {
                System.out.println("0 nota(s) de R$ "+x+",00");
            }
        }
    }
}

/*Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor
pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor
lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
Após cada linha deve ser imprimido o fim de linha.
*/