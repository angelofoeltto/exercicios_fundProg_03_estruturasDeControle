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
public class ex_07 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 3;

    int num[] = new int[TAM];

    System.out.println("\nOrdem crescente\n");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe um número inteiro: ");
      num[i] = imput.nextInt();
    }

    for (int i = 0; i < TAM; i++)
      for (int j = 1; j < (TAM - i); j++)
        if(num[j - 1] > num[j]) {
          int aux = num[j - 1];
          num[j - 1] = num[j];
          num[j] = aux;
        }

    System.out.print("\nNúmeros em ordem crescente: ");
    for (int n: num) {
      System.out.printf("%d ", n);
    }
  }
}
