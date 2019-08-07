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
public class ex_22 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num     = 1111;
    int unidade = 0;
    int dezena  = 0;
    int centena = 0;


    System.out.println("\nInformando centenas, unidades e dezenas\n");
    while (num > 1000) {
      System.out.print("Informe um número inteiro menor que 1000: ");
      num = unidade = imput.nextInt();
    }

    centena = (int)Math.floor(unidade / 100);
    unidade -= (centena * 100);
    dezena = (int)Math.floor(unidade / 10);
    unidade -= (dezena * 10);

    System.out.printf("%d: \n%d centena(s)\n%d dezena(s)\n%d unidade(s)", num, centena, dezena, unidade);
  }
}
