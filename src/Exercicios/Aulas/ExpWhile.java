package Exercicios.Aulas;

import java.util.Scanner;

public class ExpWhile {
    public static void main(String[] args) {
        String nome= null;
        int contador = 0;

        Scanner ac = new Scanner(System.in);
        while (!nome.equalsIgnoreCase("fim")){
            System.out.println("digite um nome");
            nome = ac.nextLine();
            if (nome.equalsIgnoreCase("maria")){
                contador++;
            }
        }
        System.out.println("Foram digitados " + contador);
    }

}
