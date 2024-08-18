/*
Faça um programa para ler três notas de um aluno em uma 
disciplina e imprimir sua média ponderada (as notas têm pesos
 respectivos de 5, 3 e 2). */

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as três notas do aluno");
        // entrada
        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = teclado.nextDouble();
        // processo
        double nota1peso = (nota1 * 5) / 10;
        double nota2peso = (nota2 * 3) / 10;
        double nota3peso = (nota3 * 2) / 10;
        double mediaponderada = nota1peso + nota2peso + nota3peso;
        // saida
        System.out.println("Media ponderada: ");
        System.out.println(mediaponderada);
        teclado.close();
    }
}
