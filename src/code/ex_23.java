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
public class ex_23 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 3;

    int idade[]  = new int[TAM];
    double media = 0;

    System.out.println("\nOMédia de Idade\n");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe idade do aluno: ");
      idade[i] = imput.nextInt();
      media += idade[i];
    }

    System.out.print("\nMédia de idade dos alunos\n");
    if (media < 25)
      System.out.println("Turma Jovem");
    else
      if (media >= 25 && media < 40)
        System.out.println("Turma Adulta");
      else
        System.out.println("Turma Idosa");
  }
}