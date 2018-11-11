package Exercicios.Exercicio02;

import javax.swing.*;

/**
     * Fazer um programa que receba a idade de um nadador e imprima a sua categoria segundo os dados a seguir:
     * Categorias: Infantil A (5 - 7 anos), Infantil B (8 - 10 anos), Juvenil A (11 - 13 anos), Juvenil B (14 - 17 anos) e
     * Sênior (maiores de 18 anos).
 */
public class Exercicio16 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Nadador"));

        if (idade >= 7 && idade <=5 ){
            JOptionPane.showMessageDialog(null, "Categoria Infantil A");
        }else if (idade >= 10 && idade <=8 ){
            JOptionPane.showMessageDialog(null, "Categoria Infantil B");
        }else if (idade >= 13 && idade <=11){
            JOptionPane.showMessageDialog(null, "Categoria Juvenil A");
        }else if (idade >= 17 && idade <=14 ){
            JOptionPane.showMessageDialog(null, "Categoria Juvenil B");
        }else if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Categoria Senio + 18");
        }else {
            JOptionPane.showMessageDialog(null, "Não tem Categoria ");
        }
    }
}
