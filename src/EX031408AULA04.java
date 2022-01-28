/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jennifer
 */
public class EX031408AULA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**Um representante comercial recebe mensalmente R$3000,00 mais uma comissão de 2% do seu salário por venda. 
          * Crie um programa que receba a quantidade de vendas e calcule o salário final do mês.*/
         double salario,vendas,comissao,valvenda;
         Scanner leitor = new Scanner(System.in);
         
         salario = 3000;
         
         System.out.print("Quantidade de vendas: ");
         vendas = leitor.nextDouble();
         
         valvenda = (salario/100)*2;
         comissao = vendas*valvenda;
         salario = salario + comissao;
         
         System.out.println("Salário final: " + salario );
         
         
         
         
      
         
    }
    
}
