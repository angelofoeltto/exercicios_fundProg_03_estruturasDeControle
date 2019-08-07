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
public class ex_12 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double AUMENTONV01 = 0.2f;
    final double AUMENTONV02 = 0.15f;
    final double AUMENTONV03 = 0.1f;
    final double AUMENTONV04 = 0.05f;

    int percentual = 0;
    double salario = 0;
    double salarioNovo = 0;
    double valorAumento = 0;

    System.out.println("\nCalculo de reajuste salário\n");
    System.out.print("Informe o salário ganho: ");
    salario = imput.nextDouble();

    if (salario <= 280) {
      valorAumento = salario * AUMENTONV01;
      percentual = (int)(AUMENTONV01 * 100);
    } else
      if (salario > 280 && salario <= 700) {
        valorAumento = salario * AUMENTONV02;
        percentual = (int)(AUMENTONV02 * 100);
      } else
          if(salario > 700 && salario <= 1500) {
            valorAumento = salario * AUMENTONV03;
            percentual = (int)(AUMENTONV03 * 100);
          } else {
            valorAumento = salario * AUMENTONV04;
            percentual = (int)(AUMENTONV04 * 100);
          }

    salarioNovo = valorAumento + salario;

    //saidas
    System.out.printf("\nSalário antes do reajuste: R$ %.2f", salario);
    System.out.printf("\nPercentual do aumento %d%%", percentual);
    System.out.printf("\nValor do aumento: R$ %.2f", valorAumento);
    System.out.printf("\nNovo salário: R$ %.2f", salarioNovo);
  }
}
