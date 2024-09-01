package LogicaDeProgramacaoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ABeC1 {
    public static void main(String[] args) {
//        1 - Faça um algoritmo que leia os valores de A, B, C
//        e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Digite o valor de A");
        double A = scanner.nextDouble();

        System.out.println("Digite o valor de B");
        double B = scanner.nextDouble();

        System.out.println("Digite o valor de C");
        double C = scanner.nextDouble();

        double somaAB = A + B;

        if ( somaAB < C){
            System.out.println("C é maior que A e B");
        }else{
            System.out.println("C é menor que A e B");
        }
    } catch (InputMismatchException e){
        System.out.println("Somente números inteiros e decimais ex: 1,2,3,4 e 1.0, 2.5, 4.555555 e etc!");
    }
    }
}
