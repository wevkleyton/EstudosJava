package Exercicios.Exercicio02;

//Entrar com um número e imprimir se ele é ou não divisível por 5.


import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe um Número"));

        if (num % 5 == 0){
            JOptionPane.showMessageDialog(null, "Número é divisivel por 5");
        }else {
            JOptionPane.showMessageDialog(null, "Número não é divisivel por 5");
        }
    }
}
