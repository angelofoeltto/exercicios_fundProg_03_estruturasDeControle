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
public class ex_18 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 3;

    double lado[] = new double[TAM];
    float resultado = 0;

    System.out.println("\nLado do triângulo");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("Informe lado %d: ", (i + 1));
      lado[i] = imput.nextInt();
    }

    System.out.println("\nTriângulo é...");
    if (lado[0] == lado[1] && lado[1] == lado[2])
      System.out.println("\nEquilátero");
    else
      if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2])
        System.out.println("\nIsósceles");
      else
        System.out.println("\nEscaleno");
  }
}