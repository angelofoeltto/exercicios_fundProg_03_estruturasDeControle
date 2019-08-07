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
public class ex_27 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double num = 0;

    System.out.println("\nNúmero imteiro ou decimal\n");
    System.out.print("Informe um número: ");
    num = imput.nextDouble();

    if (num == (int)num)
      System.out.printf("\nO número %d é inteiro.", num);
    else
      System.out.printf("\nO número %d é decimal.", num);
  }
}
