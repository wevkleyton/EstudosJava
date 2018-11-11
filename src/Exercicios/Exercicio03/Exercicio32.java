package Exercicios.Exercicio03;

import javax.swing.*;

/**
 * @author wev
 * Em Matemática, um número perfeito é um número natural para o qual a soma de todos os seus
 * divisores   naturais   próprios   (excluindo   ele   mesmo)   é   igual   ao   próprio   número.   Ex:   28,   pois
 * 28=1+2+4+7+14. Escreva um programa que leia um número e verifique se ele é um número perfeito.
 */
public class Exercicio32 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informa um numero :"));
        JOptionPane.showMessageDialog(null, numeroPerfeito(numero));
    }

    public static String numeroPerfeito(int numero) {
        int cont = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                cont = i + cont;
            }
        }
        if (cont == numero) {
            return "Numero Perfeito";
        } else {
            return "Numero Imperfeito";
        }
    }
}
