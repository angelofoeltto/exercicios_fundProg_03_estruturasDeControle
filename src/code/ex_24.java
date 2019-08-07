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

import java.util.Scanner;

/**
 * @author neo
 * @create 07/08/2019
 */
public class ex_24 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 2;

    float nota[] = new float[TAM];
    float media = 0;
    String situacao = "";
    char conceito;

    System.out.println("\nNotas do semestre");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("Informe nota %d: ", (i + 1));
      nota[i] = imput.nextInt();
      media += nota[i];
    }

    media /= TAM;

    //Conceito
    if (media >= 0 && media < 4) {
      conceito = 'E';
      situacao = " -> Reprovado";
    } else
      if (media >= 4 && media < 6) {
        conceito = 'D';
        situacao = " -> Reprovado";
      } else
        if (media >= 6 && media < 7.5) {
          conceito = 'C';
          situacao = " -> Aprovado";
        } else
          if (media >= 7.5 && media < 8) {
            conceito = 'B';
            situacao = " -> Aprovado";
          } else {
            conceito = 'A';
            if (media == 10)
              situacao = " -> Aprovado com Distinção";
            else
              situacao = " -> Aprovado";
          }

    System.out.println("\nInformações do semestre...");
    for (int i = 0; i < TAM; i++)
      System.out.printf("\nNota %d: %.1f", (i + 1), nota[i]);
    System.out.printf("\nMédia: %.1f %s", media, situacao);
    System.out.printf("\nConceito obtido: %s\n", conceito);
  }
}