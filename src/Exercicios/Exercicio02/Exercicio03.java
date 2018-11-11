package Exercicios.Exercicio02;

import javax.swing.*;

// Ler um número e imprimir se ele é positivo, negativo ou nulo.
public class Exercicio03 {
    public static void main(String[] args) {
        int num = 0, resp ;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe Um Número"));

        resp = num + num1;

        if (resp >= 1){
            JOptionPane.showMessageDialog(null, "Positivo");
        }else if (resp <= -1){
            JOptionPane.showMessageDialog(null, "negativo");
        }else{
            JOptionPane.showMessageDialog(null, "Nulo");
        }
    }
}
