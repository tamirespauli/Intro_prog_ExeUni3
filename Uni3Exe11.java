/* Descreva um programa que dado uma temperatura 
em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32

  */

import java.util.Scanner;
public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Infome a temperatura em °C: ");
        double temperaturaC = teclado.nextDouble();
        double temperaturaF = (9/5) * temperaturaC + 32;
        System.out.print("Temperatura em °F: " + temperaturaF);

        teclado.close();
    }
}
