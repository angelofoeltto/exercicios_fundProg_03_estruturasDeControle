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
public class ex_10 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 3;

    double numero[] = new double[TAM];
    double maior    = 0;
    double menor    = 0;

    System.out.println("\nNúmero maior e menor\n");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe número: ");
      numero[i] = imput.nextInt();

      if (i != 0){
        if (maior < numero[i])
          maior = numero[i];
        if (menor > numero[i])
          menor = numero[i];
      } else {
        maior = numero[i];
        menor = numero[i];
      }
    }

    System.out.println("\nInformações sobre os números...");
    System.out.printf("Maior: %.3f", maior);
    System.out.printf("\nMenor: %.3f", menor);
  }
}
