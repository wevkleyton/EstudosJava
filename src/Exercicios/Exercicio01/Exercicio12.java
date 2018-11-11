package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 12. Entrar com dois números inteiros e imprimir o dividendo, divisor, quociente e resto.
 */
public class Exercicio12 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero"));

        double div = num1 / num2;
        double resto = num1 % num2;
        System.out.println("Dividendo: " + num1);
        System.out.println("Divisor: " + num2);
        System.out.println("Cociente: " + div);
        System.out.println("Resto: " + resto);
    }
}
