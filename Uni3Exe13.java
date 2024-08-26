/*
 * Numa loja de materiais de construção, um azulejo estampado 
 * custa R$ 12,50. Faça um programa para ler o comprimento e altura
 *  de uma parede (em metros), e depois escrever o valor gasto com a 
 * compra de azulejos. 
 * Considere que um metro quadrado é formado por 9 azulejos.
 //entrada 

 Comprimento da parede: 
 altura da parede: 

 Processo 
Area = comprimento * altura 
valometroquadrado = 112,50
valor final = area * 112,50

//saida 
valor dos azulejos 

 * 
 */

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Esvreva o comprimento (m) da parede: ");
        double comprimento = teclado.nextDouble();
        System.out.print("Esvreva o altura (m) da parede: ");
        double altura = teclado.nextDouble();

        double area = comprimento * altura;
        double numeroAzulejo = area * 9;
        double valorAzulejo = numeroAzulejo * 12.50;

        System.out.println("Valor final dos azulejos R$ " + valorAzulejo);

        teclado.close();
    }
}
