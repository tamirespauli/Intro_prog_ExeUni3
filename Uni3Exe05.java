/*Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são 
dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa
 R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja 
 para marcar todos os seus frangos.
 
//entrada 
quantidade de frango

//processo 
quantidad de frango * ( (chip de identificação 4,00) + (9chip tipo de alimento 3,50*2))


//saida 
gasto total da granja 
 para marcar todos os seus frangos.


 */

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.print("Quantidade de frangos: ");
        double frangoQuant = teclado.nextDouble();

        //processo 
        double frangoGasto = frangoQuant * (4.00+(3.50*2))  ;

        //saida 
        System.out.print("Gasto total da granja: ");
        System.out.print(frangoGasto);


        teclado.close();
    }
}
