package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 05. Ler dois números reais (num1 e num2) e imprimir sua soma, subtração, multiplicação e divisão.
 */
public class Exercicio05 {
    public static void main(String[] args) {

        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informa o Primero Número?"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informa o Segundo Número?"));

        double soma = num1 + num2 ;
        double subtracao = num1 - num2;
        double mulplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Soma:" + soma);
        System.out.println("subração: " + subtracao );
        System.out.println("Multiplicação: " + mulplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
