package org.exercicios;

import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        //TODO: Crie as condições necessárias para imprimir cada uma das possíveis saídas.

        if (numero == 1) {
            System.out.println("Pare! O sinal está vermelho.");
        } else if (numero == 2) {
            System.out.println("Atencao! O sinal esta amarelo.");
        } else if (numero == 3) {
            System.out.println("Siga em frente! O sinal esta verde.");
        } else {
            System.out.println("Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        }
    }
}
