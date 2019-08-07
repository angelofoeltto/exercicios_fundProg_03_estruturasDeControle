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
 * @create 04/08/2019
 */
public class ex_05 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    char letra;

    System.out.println("\nDeterminando vogal\n");
    System.out.print("Informe letra: ");
    letra = imput.next().toUpperCase().charAt(0);

    if (letra == 'A'
     && letra == 'E'
     && letra == 'I'
     && letra == 'O'
     && letra == 'U')
      System.out.println("Letra é uma vogal.");
    else
      System.out.println("Letra não é uma vogal.");
  }
}
