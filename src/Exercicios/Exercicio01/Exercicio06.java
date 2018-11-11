package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 06. Entrar com seu nome e imprimi-lo.
 */
public class Exercicio06 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Infome o Seu Nome?");
        System.out.printf("Nome: %s",nome);
    }
}
