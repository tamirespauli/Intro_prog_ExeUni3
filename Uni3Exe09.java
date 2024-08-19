
/*
 Descreva um programa que calcule o volume de uma 
 lata de óleo. Fórmula:

V=π×raio^2xaltura

//entrada 
raio 
altura

//processo 
V=π×raio^2xaltura

//saida 
volume 

 */
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada
        System.out.print("Informe o Raio da lata de óleo (cm): ");
        double valorRaio = teclado.nextDouble();
        System.out.print("Informe o Altura da lata de óleo (cm): ");
        double valorAltura = teclado.nextDouble();
        //processo 
        double valorVolume = 3.141592 * (valorRaio * valorRaio) * valorAltura; 
        //saida
        System.out.print("Valor do volume: ");
        System.out.print(valorVolume);

        teclado.close();
    }
}
