/*Suponha que um caixa disponha apenas de notas de 100, 
10 e 1 reais. Considerando que alguém está pagando uma compra, 
faça um programa que determine e escreva o número mínimo de notas que 
o caixa deve fornecer como troco. Escreva também o número de cada tipo 
de nota a ser fornecido como troco. 
Suponha que o sistema monetário não utilize centavos. */

//entrada trco

//processo: troco / 100 troco /10 ... 

//saida: tipo de nota e numero minimo de nota 

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do troco; ");
        int valorTroco = teclado.nextInt();
        int notas100 = valorTroco / 100;
        valorTroco %= 100;
        int notas10 = valorTroco / 10;
        valorTroco %= 10;
        int notas1 = valorTroco;

        System.out.println("Notas 100: " + notas100);
        System.out.println("Notas 10: " + notas10);
        System.out.println("Notas 1: " + notas1);
        teclado.close();

    }
}
