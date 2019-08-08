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

package code;

import java.util.Scanner;

/**
 * @author neo
 * @create 08/08/2019
 */
public class ex_27 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double num       = 0;
    double num1      = 0;
    double resultado = 0;
    char operacao;

    System.out.println("\nNúmero imteiro ou decimal\n");
    System.out.print("Informe um número: ");
    num = imput.nextDouble();
    System.out.print("Informe um número: ");
    num1 = imput.nextDouble();
    System.out.print("Informe operaçã0 (+ - / *): ");
    operacao = imput.next().charAt(0);

    switch (operacao) {
      case '+':
        resultado = num + num1;
        break;
      case '-':
        resultado = num - num1;
        break;
      case '*':
        resultado = num * num1;
        break;
      case '/':
        resultado = num / num1;
        break;
    }

    if (resultado == (int)resultado)
      System.out.printf("\nO número %d é inteiro.", resultado);
    else
      System.out.printf("\nO número %d é decimal.", resultado);
    if (resultado >= 0)
      System.out.printf("\nO número %d é positivo.", resultado);
    else
      System.out.printf("\nO número %d é negativo.", resultado);
    if (resultado % 2 == 0)
      System.out.printf("\nO número %d é par.", resultado);
    else
      System.out.printf("\nO número %d é ímpar.", resultado);
  }
}
