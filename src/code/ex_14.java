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
public class ex_14 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num = -1;

    System.out.println("\nDias da semana...\n");

    while (num < 0 || num > 7) {
      System.out.print("Informe dia da semana (1 - Domingo; 2 - Segunda ...): ");
      num = imput.nextInt();
      //
      if (num < 0 || num > 7)
        System.out.println("\n\tError!\n");
    }

    switch (num) {
      case 1:
        System.out.println("\nDomingo");
        return;
      case 2:
        System.out.println("\nSegunda-Feira");
        return;
      case 3:
        System.out.println("\nTerça-Feira");
        return;
      case 4:
        System.out.println("\nQuarta-Feira");
        return;
      case 5:
        System.out.println("\nQuinta-Feira");
        return;
      case 6:
        System.out.println("\nSexta-Feira");
        return;
      case 7:
        System.out.println("\nSábado");
        return;
    }
  }
}
