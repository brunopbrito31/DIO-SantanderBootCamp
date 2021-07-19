package challenges.firststepsinjava;

import java.util.Scanner;

//Enunciado ao final do código

public class SixOddNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cont = 6;

        while (cont > 0) {
            if (num % 2 == 1) {
                if (cont == 6) {
                    System.out.println(num);
                    num = num + 2;
                } else {
                    System.out.println(num);
                    num = num + 2;
                }
                cont--;
            } else {
                if (cont == 6) {
                    num = num + 1;
                    System.out.println(num);
                    num = num + 2;
                    cont--;
                }
            }
        }
        in.close();
    }
}

/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por
linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/
