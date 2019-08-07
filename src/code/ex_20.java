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

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author neo
 * @create 07/08/2019
 */
public class ex_20 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    GregorianCalendar calendar = new GregorianCalendar();

    int ano = 0;

    System.out.println("\nAno bissexto\n");
    System.out.print("Informe ano (aaaa): ");
    ano = imput.nextInt();

    if (calendar.isLeapYear(ano))
      System.out.println("O é bissesxto.");
    else
      System.out.println("O não é bissesxto.");
  }
}
