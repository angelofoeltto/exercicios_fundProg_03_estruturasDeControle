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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

/**
 * @author neo
 * @create 07/08/2019
 */
public class ex_21 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("dd/mm/aaaa").withResolverStyle(ResolverStyle.STRICT);

    String data = "";

    System.out.println("\nData válida\n");
    System.out.print("Informe data (dd/mm/aaaa): ");
    data = imput.nextLine().trim();

    try {
      LocalDate d = LocalDate.parse(data, dtformat);
      System.out.println("Data válida!!!\n");
    } catch (DateTimeParseException ex) {
      System.out.println("Data não válida!!!\n");
    }
  }
}
