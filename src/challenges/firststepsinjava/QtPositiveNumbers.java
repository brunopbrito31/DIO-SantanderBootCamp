package challenges.firststepsinjava;

import java.util.*;

//Enunciado ao final do código

public class QtPositiveNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        Double[] numbers = new Double[6];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = reader.nextDouble();
        }

        System.out.println(Arrays.asList(numbers).stream().filter(x -> x > 0).count()+" valores positivos");
        reader.close();
    }
}

/*
Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo
desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
Não esqueça da mensagem "valores positivos" ao final.
*/
