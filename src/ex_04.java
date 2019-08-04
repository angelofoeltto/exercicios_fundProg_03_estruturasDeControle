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

import java.util.Scanner;

/**
 * @author neo
 * @create 04/08/2019
 */
public class ex_04 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int ano = 0;

    System.out.println("\nAno bixesto\n");
    System.out.print("Informe ano (aaaa): ");
    ano = imput.nextInt();

    if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
      System.out.printf("\nAno %d é bixesto", ano);
    else
      System.out.printf("\nAno %d não é bixesto", ano);
  }
}
