package Exercicios.Exercicio02;

import javax.swing.*;

//    Ler um número e, caso seja maior que 10, imprimir o dobro do número, caso contrário, imprimir a metade.
public class Exercicio01 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informa um Número"));

        if ( num > 10){
            System.out.println("Doblro :" + num * 2 );
        }else {
            System.out.println("Doblro :" + num / 2 );
        }
    }
}
