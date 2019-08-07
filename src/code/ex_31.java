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
public class ex_31 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double FILEDUPLOATE5  = 4.9f;
    final double FILEDUPLO      = 5.8f;
    final double ALCATRAATE5    = 5.9f;
    final double ALCATRA        = 6.8f;
    final double PICANHAATE5    = 6.9f;
    final double PICANHA        = 7.8f;
    final double DESCONTOCARTAO = 0.05f;

    double quilo              = 0;
    double total              = 0;
    double desconto           = 0;
    String tipoDeCarneExtenso = "";
    char tipoDeCarne;
    char tipoDePagamento;

    System.out.println("Açougue Supermercado");
    System.out.print("Informe o tipo de carne (alcatra, picanha ou file): ");
    tipoDeCarne = imput.next().toUpperCase().charAt(0);
    System.out.print("Quantidade de quilos: ");
    quilo = imput.nextDouble();
    System.out.print("Informe tipo de pagamento (dinheiro ou cartao): ");
    tipoDePagamento = imput.next().toUpperCase().charAt(0);

    if (quilo < 5)
      switch (tipoDeCarne) {
        case 'A':
          total = quilo * ALCATRAATE5;
          tipoDeCarneExtenso = "Alcatra";
          break;
        case 'P':
          total = quilo * PICANHAATE5;
          tipoDeCarneExtenso = "Picanha";
          break;
        case 'F':
          total = quilo * FILEDUPLOATE5;
          tipoDeCarneExtenso = "Filé Duplo";
          break;
      }
    else
      switch (tipoDeCarne) {
        case 'A':
          total = quilo * ALCATRA;
          tipoDeCarneExtenso = "Alcatra";
          break;
        case 'P':
          total = quilo * PICANHA;
          tipoDeCarneExtenso = "Picanha";
          break;
        case 'F':
          total = quilo * FILEDUPLO;
          tipoDeCarneExtenso = "Filé Duplo";
          break;
      }
    if (tipoDePagamento == 'C')
      desconto = (total * DESCONTOCARTAO);

    System.out.println("\nCupom Fiscal\n");
    System.out.printf("Tipo de carne: %s", tipoDeCarneExtenso);
    System.out.printf("\nQuilos: %.2f", quilo);
    System.out.printf("\nPreço Total: R$ %.2f", total);
    System.out.printf("\nForma de pagamento: %s", (tipoDePagamento == 'C') ? "Cartão" : "Dinheiro");
    System.out.printf("\nValor do Desconto: R$ %.2f", desconto);
    System.out.printf("\nValor a pagar: R$ %.2f", (total - desconto));
  }
}