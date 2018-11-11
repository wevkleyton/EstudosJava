package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 10. Ler um número inteiro e imprimir o seu sucessor e o seu antecessor.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        int result = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        System.out.printf("Numero: %s \nSucessor: %s \nAntecessor: %s" , result, result++ , result--);
    }
}
