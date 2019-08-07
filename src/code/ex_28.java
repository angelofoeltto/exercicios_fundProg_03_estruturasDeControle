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
public class ex_28 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 5;

    char resposta[] = new char[TAM];
    int cont        = 0;
    int totalSim    = 0;

    System.out.println("\nSuspeito -> Responda com Sim ou Não");

    System.out.print("Telefonou para a vítima? ");
    resposta[cont++] = imput.next().toUpperCase().charAt(0);
    System.out.print("Esteve no local do crime? ");
    resposta[cont++] = imput.next().toUpperCase().charAt(0);
    System.out.print("Mora perto da vítima? ");
    resposta[cont++] = imput.next().toUpperCase().charAt(0);
    System.out.print("Devia para a vítima? ");
    resposta[cont++] = imput.next().toUpperCase().charAt(0);
    System.out.print("Já trabalhou com a vítima? ");
    resposta[cont++] = imput.next().toUpperCase().charAt(0);

    System.out.println("\nInformações sobre o Suspeito...\n");
    for (int i = 0; i < TAM; i++)
      if (resposta[i] == 'S')
        totalSim++;

      switch (totalSim) {
        case 2:
          System.out.println("SUSPEITO");
          break;

        case 3: case 4:
          System.out.println("CÚMPLICE");
          break;

        case 5:
          System.out.println("ASSASSINO");
          break;

        default:
          System.out.println("INOCENTE");
          break;
      }
  }
}
