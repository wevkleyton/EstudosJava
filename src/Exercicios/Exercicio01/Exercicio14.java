package Exercicios.Exercicio01;

import javax.swing.*;

/**
 14. Entrar com 4 números e imprimir a média ponderada (pesos: 1, 2, 3 e 4 respectivamente).
 *
 */
public class Exercicio14 {
    public static void main(String[] args) {
        double num1, num2, num3, num4 , media;

         num1 = Double.parseDouble(JOptionPane.showInputDialog("Informa o primeiro numero"));
         num2 = Double.parseDouble(JOptionPane.showInputDialog("Informa o segundo numero"));
         num3 = Double.parseDouble(JOptionPane.showInputDialog("Informa o terceiro numero"));
         num4 = Double.parseDouble(JOptionPane.showInputDialog("Informa o quarto numero"));

        media = (num1 + 1) + (num2 + 2)+ (num3 + 3)+(num4 + 4) / 1+2+3+4;
        JOptionPane.showMessageDialog(null, "A media ponderada é : " + media);
    }
}
