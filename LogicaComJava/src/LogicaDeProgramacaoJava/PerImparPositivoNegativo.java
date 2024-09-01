package LogicaDeProgramacaoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerImparPositivoNegativo {
    public static void main(String[] args) {
        //2 - Faça um algoritmo para receber um número qualquer e
        // imprimir na tela se o número é par ou ímpar, positivo ou negativo
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Digite um número par seber se ele é positivo ou negativo, par ou ímpar");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é impar");
            }

            if (numero < 0) {
                System.out.println("O numero é negativo");
            } else {
                System.out.println("O numero é positivo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Somente números inteiros");
        }
    }
}
