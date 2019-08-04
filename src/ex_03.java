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
public class ex_03 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    char sexo;

    System.out.println("\nVerificando sexo\n");
    System.out.print("Informe sexo ou apenas a primeira letra: ");
    sexo = imput.next().toUpperCase().charAt(0);

    if (sexo == 'F')
      System.out.println("Sexo: Feminino.");
    else
      System.out.println("Sexo: Masculino.");
  }
}
