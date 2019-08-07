/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

package code;import java.util.Scanner;

/**
 * @author neo
 * @create 04/08/2019
 */
public class ex_13 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double IR01 = 0.05;
    final double IR02 = 0.1;
    final double IR03 = 0.2;
    final double INSS = 0.1;
    final double FGTS = 0.11;

    int hora            = 0;
    int irValor         = 0;
    double valor        = 0;
    double valorBruto   = 0;
    double valorLiquido = 0;
    double descontos    = 0;
    double ir           = 0;
    double inss         = 0;
    double fgts         = 0;

    System.out.println("\nCalculo do salário\n");
    System.out.print("Informe o valor ganho por hora trabalhada (por mês): ");
    hora = imput.nextInt();

    System.out.print("Informe a quantidade de horas trabalhadas: ");
    valor = imput.nextDouble();

    valorBruto = valor * hora;

    if (valorBruto > 900 && valorBruto <= 1500) {
      ir      = IR01 * valorBruto;
      irValor = (int)(IR01 * 100);
    } else
    if(valorBruto > 1500 && valorBruto <= 2500) {
      ir      = IR02 * valorBruto;
      irValor = (int)(IR02 * 100);
    } else {
      ir      = IR03 * valorBruto;
      irValor = (int)(IR03 * 100);
    }

    //Descontos
    inss         = INSS * valorBruto;
    fgts         = FGTS * valorBruto;
    descontos    = ir + inss;
    valorLiquido = valorBruto - descontos;

    //saidas
    System.out.printf("\n+ Salário Bruto (%d * %.2f) : R$ %.2f", hora, valor, valorBruto);
    System.out.printf("\n- IR   (%d%%) : R$ %.2f", irValor, ir);
    System.out.printf("\n- INSS (%d%%) : R$ %.2f", (int)(INSS * 100), inss);
    System.out.printf("\n  FGTS (%d%%) : R$ %.2f", (int)(FGTS * 100), fgts);
    System.out.printf("\n- Total de descontos : R$ %.2f", descontos);
    System.out.printf("\n= Salário Líquido : R$ %.2f", valorLiquido);
  }
}

