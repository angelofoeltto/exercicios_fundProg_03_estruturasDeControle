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
 * @create 07/08/2019
 */
public class ex_30 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double PRECOMORANGOATE5 = 2.5f;
    final double PRECOMORANGO     = 1.8f;
    final double PRECOMACAATE5    = 2.2f;
    final double PRECOMACA        = 1.5f;
    final double DESCONTO         = 0.08f;

    double total        = 0;
    double desconto     = 0;
    double quiloMaca    = 0;
    double quiloMorango = 0;
    double precoMaca    = 0;
    double precoMorango = 0;

    System.out.println("FRUTEIRA");
    System.out.print("Informe Kg de morango: ");
    quiloMorango = imput.nextDouble();
    System.out.print("Informe Kg de maçã: ");
    quiloMaca = imput.nextDouble();

    if (quiloMaca < 5) {
      precoMaca = quiloMaca * PRECOMACAATE5;
    } else
      precoMaca = quiloMaca * PRECOMACA;

    if (quiloMorango < 5)
      precoMorango = quiloMorango * PRECOMORANGOATE5;
    else
      precoMorango = quiloMorango * PRECOMORANGO;

    if ((quiloMaca + quiloMorango) >= 8)
      desconto = (precoMaca + precoMorango) * DESCONTO;

    total = (precoMaca + precoMorango);

    System.out.println("\nCupom fiscal..\n");
    System.out.printf("Preço maçã: R$ %.2f", precoMaca);
    System.out.printf("\nPreço morango: R$ %.2f", precoMorango);
    System.out.printf("\nPreço desconto: R$ %.2f", desconto);
    System.out.printf("\nPreço Total: R$ %.2f", total);
    System.out.printf("\nPreço a pagar: R$ %.2f\n", (total - desconto));
  }
}
