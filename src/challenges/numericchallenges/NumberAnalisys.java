package challenges.numericchallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Enunciado ao final do código

public class NumberAnalisys {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) numbers.add(reader.nextInt());

        System.out.println(numbers.stream().filter(x -> (x % 2 == 0)).count() + " valor(es) par(es)");
        System.out.println(numbers.stream().filter(x -> (x % 2 != 0)).count() + " valor(es) impar(es)");
        System.out.println(numbers.stream().filter(x -> x > 0).count() + " valor(es) positivo(s)");
        System.out.println(numbers.stream().filter(x -> x < 0).count() + " valor(es) negativo(s)");
        reader.close();
    }
}

/*Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados
são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de
linha após cada uma.
*/
