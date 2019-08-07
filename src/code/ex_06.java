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
public class ex_06 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num1 = 0;

    System.out.println("\nPar ou ímpar\n");
    System.out.print("Informe um número inteiro: ");
    num1 = imput.nextInt();

    if (num1 % 2 == 0)
      System.out.printf("\nO número %d é par e agora é ímpar (%d).", num1, (num1 + 1));
    else
      System.out.printf("\nO número %d é impar e agora é par (%d).", num1, (num1 + 1));
  }
}
