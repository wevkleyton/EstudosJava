package Exercicios.Exercicio02;

import javax.swing.*;

// Ler um número inteiro e imprimir uma mensagem informando se o número é par ou ímpar.
public class Exercicio02 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informa um Número"));
        if (num %2 == 0){
            JOptionPane.showMessageDialog(null,"O Número é par ");
        }else{
            JOptionPane.showMessageDialog(null,"O Número é Impar ");
        }
    }
}
