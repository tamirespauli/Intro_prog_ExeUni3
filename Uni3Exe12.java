/*Uma empresa tem para um funcionário 
os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes.
 A empresa paga R$ 10,00 por hora 
 (valor para cálculo do salário trabalho)
  e R$ 60,00 por dependente (valor para cálculo do 
  salário família) e são feitos descontos de 8,5% 
  sobre o salário trabalho para o INSS e de 5% sobre o 
  salário trabalho para o imposto de renda. Descreva um 
  programa que informe o nome, o salário bruto e o salário
  líquido do funcionário.
 
  // entrada 
     
  nome, neumero de horas trabalhadas mensais, numero de dependentes 

  INSS 8,5% 
  IR 5%
 
  hora trabalhada: R$10
  valor adicional por dependente: R$60,00  

  // processo 
  valor bruto: (horas trabalhadas * 10 ) + (dependente * 60)
  valor liquido = desconto/100 *  salario bruto 

  //saida 
  salrio bruto 
  salario liquido 
  */

import java.util.Scanner;
public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        //entrada 
        System.out.print("Nome: ");
        String nome = teclado.next();
        System.out.print("Horas trabalhadas: ");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.print("N° dependentes: ");
        double numDependentes = teclado.nextDouble();
        double valorHora = 10.00;
        double valorDependente = 60.00;
        double desInss = 8.5;
        double desIr = 5.0;
        //processo
        double salarioBruto = (horasTrabalhadas * valorHora) + (numDependentes * valorDependente);
        double calculoInss = (desInss / 100) * salarioBruto;
        double calculoIr = (desIr/ 100) * salarioBruto;
        double descontoFinal = calculoInss + calculoIr;
        double salarioLiquido = salarioBruto - descontoFinal;
        //saida 
        System.out.println("Resultado de "+ nome);
        System.out.println("Salrio Bruto R$ " + salarioBruto);
        System.out.println("Salrio Liquido R$ " + salarioLiquido);


        teclado.close();
    }
}
