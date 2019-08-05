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
public class ex_11 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String letra;

    while (true) {
      System.out.println("\nTurno de estudo... \n");
      System.out.print("Informe turno em que estuda (vespertino, matutino ou noturno): ");
      letra = imput.next().toUpperCase();

      switch (letra) {
        case "MATUTINO":
          System.out.println("Bom dia!");
          return;
        case "VESPERTINO":
          System.out.println("Boa Trade!");
          return;
        case "NOTURNO":
          System.out.println("Boa Noite!");
          return;
        default:
          System.out.println("ERROR!!");
          break;
      }
    }
  }
}
