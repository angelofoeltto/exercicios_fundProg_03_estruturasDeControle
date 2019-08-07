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
public class ex_32 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 10;
    final char gabarito[] = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};

    char questoes[] = new char[TAM];
    int pontuacao   = 0;

    System.out.println("\nInforme respotas da progra");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("Q%d: ", (i + 1));
      questoes[i] = imput.next().toUpperCase().charAt(0);
    }

    System.out.println("\nResultado\n");
    for (int i = 0; i < TAM; i++) {
      if (questoes[i] == gabarito[i])
        pontuacao++;
      System.out.printf("\nQ%d: Assinalada - %s: Gabarito - (%s)", (i + 1), questoes[i], gabarito[i]);
    }
    System.out.printf("\nPontuação final: %d\n", pontuacao);
  }
}
