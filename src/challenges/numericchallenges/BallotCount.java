package challenges.numericchallenges;

import java.util.Scanner;

public class BallotCount {

    //Enunciado ao final da página

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int valor = reader.nextInt();
        separarNotas(valor);
        reader.close();
    }

    public static void separarNotas(int valor) {
        int qt = 0, auxiliar = valor;
        if (auxiliar >= 100) {
            qt = auxiliar / 100;
            System.out.println(qt + " nota(s) de R$ 100,00");
            auxiliar = auxiliar % 100;
        } else {
            System.out.println("0 nota(s) de R$ 100,00");
        }
        if (auxiliar >= 50) {
            qt = auxiliar / 50;
            System.out.println(qt + " nota(s) de R$ 50,00");
            auxiliar = auxiliar % 50;
        } else {
            System.out.println("0 nota(s) de R$ 50,00");
        }
        if (auxiliar >= 20) {
            qt = auxiliar / 20;
            System.out.println(qt + " nota(s) de R$ 20,00");
            auxiliar = auxiliar % 20;
        } else {
            System.out.println("0 nota(s) de R$ 20,00");
        }
        if (auxiliar >= 10) {
            qt = auxiliar / 10;
            System.out.println(qt + " nota(s) de R$ 10,00");
            auxiliar = auxiliar % 10;
        } else {
            System.out.println("0 nota(s) de R$ 10,00");
        }
        if (auxiliar >= 5) {
            qt = auxiliar / 5;
            System.out.println(qt + " nota(s) de R$ 5,00");
            auxiliar = auxiliar % 5;
        } else {
            System.out.println("0 nota(s) de R$ 5,00");
        }
        if (auxiliar >= 2) {
            qt = auxiliar / 2;
            System.out.println(qt + " nota(s) de R$ 2,00");
            auxiliar = auxiliar % 2;
        } else {
            System.out.println("0 nota(s) de R$ 2,00");
        }
        if (auxiliar >= 1) {
            qt = auxiliar / 1;
            System.out.println(qt + " nota(s) de R& 1,00");
        } else {
            System.out.println("0 nota(s) de R$ 1,00");
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