package Exercicios.Exercicio01;

import javax.swing.*;

/**
 * 15. Informar a base e a altura de um retângulo e imprimir o perímetro, área, diagonal, base e altura.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        int base, altura, perimetro, area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Informa a base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Informa a altura"));

        perimetro = base + altura /2 ;
        area =  base + (altura * 2);
        System.out.printf("altura:%s \nbase:%s \nperimetro:%s \náre:%s" ,altura ,base, perimetro, args);
    }
}
