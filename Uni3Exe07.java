
/*Uma fábrica de refrigerantes vende seu
 produto em três formatos: lata de 350 ml, 
 garrafa de 600 ml e garrafa de 2 litros. 
 Se um comerciante compra uma determinada quantidade 
 de cada formato, faça um programa para calcular quantos
  litros de refrigerante ele comprou.

  //entrada 
quant  lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.

// processo 

0.600 *(quant600)
350 *(quant350)
2 * (quant2)

quantfinal = quant600 + quant350 + quant2

//saida 

quantidade final 

 */


import java.util.Scanner;
public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //entrada 
        System.out.println("Digite a quantidade de cada refrigerante que você comprou abaixo: ");
        System.out.print("Refrigerante de 350ml: ");
        double quant350ml = teclado.nextDouble();
        System.out.print("Refrigerante de 600ml: ");
        double quant600ml = teclado.nextDouble();
        System.out.print("Refigerante 2L: ");
        double quant2l = teclado.nextDouble();
        // processo
        double quantFinal = (0.350 * quant350ml) + (0.600 * quant600ml) + (2 * quant2l);
        //saida 
        System.out.print("Quantidade total em litros: ");
        System.out.print(quantFinal);
        teclado.close();
    }
}
