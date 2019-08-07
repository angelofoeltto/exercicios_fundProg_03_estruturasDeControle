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
public class ex_15 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double preco = -1;
    int codigo   = -1;

    System.out.println("\nPreço do produto\n");

    while (preco < 0) {
      System.out.print("Informe preço do produto: R$ ");
      preco = imput.nextDouble();
      if (preco < 0)
        System.out.println("\n\tERROR!!");
    }

    while (codigo < 0) {
      System.out.print("Informe código de origem do produto: ");
      codigo = imput.nextInt();
      if (codigo < 0)
        System.out.println("\n\tERROR!!");
    }

    switch (codigo) {
      case 1:
        System.out.println("\nOrigem: Sul");
        System.out.printf("Preço: R$ %.2f", preco);
        return;
      case 2:
        System.out.println("\nOrigem: Norte");
        System.out.printf("Preço: R$ %.2f", preco);
        return;
      case 3:
        System.out.println("\nOrigem: LEste");
        System.out.printf("Preço: R$ %.2f", preco);
        return;
      case 4:
        System.out.println("\nOrigem: Oeste");
        System.out.printf("Preço: R$ %.2f", preco);
        return;
      case 5:
        case 6:
          System.out.println("\nOrigem: Nordeste");
          System.out.printf("Preço: R$ %.2f", preco);
          return;
      case 7:
        System.out.println("\nOrigem: Importado");
        System.out.printf("Preço: R$ %.2f", preco);
        return;
    }
  }
}
