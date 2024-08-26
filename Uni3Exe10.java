/*Descreva um programa que leia o comprimento
 dos catetos de um triângulo retângulo e calcule o 
 comprimento da hipotenusa.
Fórmula:

hipotenusa^2=cateto1^2+cateto^2 */

import java.util.Scanner;
public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada
        System.out.print("Escreva o comprimento do cateto 1: ");
        double cateto1 = teclado.nextDouble();
        System.out.print("Escreva o comprimento do cateto 2: ");
        double cateto2 = teclado.nextDouble();
        // processo
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        // saida
        System.out.print("Hipotenusa: " + hipotenusa);
        teclado.close();
    }
}
