package Exercicios.Exercicio01;


import javax.swing.*;

/**
 * Entrar com dois nomes e imprimi-los um em cada linha.
 */
public class Exercicio07 {
    public static void main(String[] args) {
        String nome1, nome2;

        nome1 = JOptionPane.showInputDialog("Informa o Primeiro Nome");
        nome2 = JOptionPane.showInputDialog("Informe o Segundo Nome");

        System.out.printf("Primeiro Nome: %s \nSegundo Nome: %s" , nome1, nome2);
    }
}
