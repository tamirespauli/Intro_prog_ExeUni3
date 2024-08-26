/*Construa um programa para ler um número inteiro 
(assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)   */

import java.util.Scanner;
public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //PROCESSO 
        System.out.print("Escreva um número com três dígitos: ");
        int num3 = teclado.nextInt();
        //Processo 
        int centena = num3 / 100; 
        int dezena = (num3%100)/10;
        int unidade = ((num3%100)%10);
        //SAIDA 
        System.out.print(centena+" Centena(s) "+dezena+(" Dezenas(s) ")+unidade+(" Unidade(s) "));      
        teclado.close();
    }
}
