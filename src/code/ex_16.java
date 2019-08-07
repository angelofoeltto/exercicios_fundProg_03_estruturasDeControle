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
public class ex_16 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 2;

    float nota[] = new float[TAM];
    float media = 0;
    String situacao = "";

    System.out.println("\nNotas do semestre");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("Informe nota %d: ", (i + 1));
      nota[i] = imput.nextInt();
      media += nota[i];
    }

    media /= TAM;

    if (media >= 0 && media < 3)
      situacao = " -> Reprovado";
    else
    if (media >= 3 && media < 7)
      situacao = " -> Em Exame";
    else
      situacao = " -> Aprovado";

    System.out.println("\nInformações do semestre...");
    for (int i = 0; i < TAM; i++)
      System.out.printf("\nNota %d: %.1f", (i + 1), nota[i]);
    System.out.printf("\nMédia: %.1f %s", media, situacao);
  }
}
