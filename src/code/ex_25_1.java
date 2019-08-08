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

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @author neo
 * @create 08/08/2019
 */
public class ex_25_1 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double saque  = 0;
    int cem       = 0;
    int cinquenta = 0;
    int vinte     = 0;
    int dez       = 0;
    int cinco     = 0;
    double um     = 0;

    System.out.println("\nCaixa eletrônico\n");
    while (saque < 10 || saque > 600) {
      System.out.print("Informe valor do saque: R$ ");
      saque = imput.nextDouble();
      if (saque < 10 || saque > 600)
        System.out.println("\nSaque < R$ 10.00 ou > R$ 600.00  -->  ERROR!!\n");
    }

    um = saque;

    cem       = (int)Math.floor(um / 100);
    um       -= (cem * 100);
    cinquenta = (int)Math.floor(um / 50);
    um       -= (cinquenta * 50);
    vinte     = (int)Math.floor(um / 20);
    um       -= (vinte * 20);
    dez       = (int)Math.floor(um / 10);
    um       -= (dez * 10);
    cinco     = (int)Math.floor(um / 5);
    um       -= (cinco * 5);

    System.out.println("\nVAlor do saque..\n");
    System.out.printf("Valor: R$ %.2f", saque);
    if (cem != 0)
      System.out.printf("\nNotas de 100: %d", cem);
    if (cinquenta != 0)
      System.out.printf("\nNotas de 50: %d", cinquenta);
    if (vinte != 0)
      System.out.printf("\nNotas de 20: %d", vinte);
    if (dez != 0)
      System.out.printf("\nNotas de 10: %d", dez);
    if (cinco != 0)
      System.out.printf("\nNotas de 5: %d", cinco);
    if (um != 0)
      System.out.printf("\nNotas de 1: %d", (int)um);
  }
}
