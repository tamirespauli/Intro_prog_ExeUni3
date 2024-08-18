/* Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões
 de um terreno e depois exibir a área do terreno. */



 import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entrada (leitura)
        System.out.println("Altura: ");
        double altura = teclado.nextDouble();
        System.out.println("Comprimento");
        double comprimento = teclado.nextDouble();

        //processo 
        double areaT = (altura * comprimento);


        //saida 
        System.out.println("Área: ");
        System.out.println(areaT);

        //OU System.out.println("Área: "+ areaT);
        teclado.close();
    }
}