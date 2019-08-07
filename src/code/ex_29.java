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
public class ex_29 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double DESCONTOALCOOLATE20      = 0.03f;
    final double DESCONTOALCOOLMAISDE20   = 0.05f;
    final double DESCONTOGASOLINAATE20    = 0.04f;
    final double DESCONTOGASOLINAMAISDE20 = 0.06f;
    final double PRECOGASOLINA            = 2.5f;
    final double PRECOALCOOL              = 1.9f;

    double litro = 0;
    double total = 0;
    char tipoCombustivel;

    System.out.println("\nPosto de Combustível\n");
    System.out.print("Informe litros abastecidos: ");
    litro = imput.nextDouble();
    System.out.print("Informe tipo de combustível: ");
    tipoCombustivel = imput.next().toUpperCase().charAt(0);

    if (tipoCombustivel == 'G') {
      total = litro * PRECOGASOLINA;
      if (litro < 20)
        total -= total * DESCONTOGASOLINAATE20;
      else
        total -= total *  DESCONTOGASOLINAMAISDE20;
    } else {
      total = litro * PRECOALCOOL;
      if (litro < 20)
        total -= total *  DESCONTOALCOOLATE20;
      else
        total -= total *  DESCONTOALCOOLMAISDE20;
    }

    System.out.printf("\n\nValor à ser pago: R$ %.3f", total);
  }
}
