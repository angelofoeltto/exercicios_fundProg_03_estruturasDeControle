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
 * @create 07/08/2019
 */
public class ex_19 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double a     = 0;
    double b     = 0;
    double c     = 0;
    double delta = 0;
    double x1    = 0;
    double x2    = 0;

    System.out.println("\nFormula de Bhaskara");
    System.out.println("ax^2 + bx + c = 0\n");
    System.out.print("Informe valor de a: ");
    a = imput.nextDouble();
    if (a == 0) {
      System.out.println("Não é equação de seungdo grau");
      return;
    }
    System.out.print("Informe valor de b: ");
    b = imput.nextDouble();
    System.out.print("Informe valor de c: ");
    c = imput.nextDouble();

    delta = Math.pow(b, 2) - ((4 * a) * c);
    x1 = (-b + Math.sqrt(delta)) / (2 * a);
    x2 = (-b - Math.sqrt(delta)) / (2 * a);

    if (delta < 0)
      System.out.println("Delta negativo - Não possui raizes reais");
    else
      if (delta == 0)
        System.out.printf("\nRaiz: %f", x1);
      else
        System.out.printf("\nRaiz 01: %.4f\nRaiz 01: %.4f\n", x1, x2);
  }
}
