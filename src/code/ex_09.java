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
 * @create 04/08/2019
 */
public class ex_09 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double altura = 0;
    double peso = 0;
    char sexo;
    double pesoIdeal = 0;

    System.out.println("Peso ideal");
    System.out.print("Informe sua altura em metros: ");
    altura = imput.nextFloat();
    System.out.print("Informe peso: ");
    peso = imput.nextFloat();
    System.out.print("Informe sexo ou apenas a primeira letra: ");
    sexo = imput.next().toUpperCase().charAt(0);

    if (sexo == 'F')
      pesoIdeal = (72.7 * altura) - 58;
    else
      pesoIdeal = (62.1 * altura) - 44.7;

    System.out.println("\nSeu dados são:");
    System.out.printf("Altura %.2f metros", altura);
    System.out.printf("\nPeso %.2f quilos", peso);
    if (sexo == 'F')
      System.out.println("\nSexo: Feminino.");
    else
      System.out.println("\nSexo: Masculino.");
    System.out.printf("\nPeso ideal %.2f quilos", pesoIdeal);
    if (pesoIdeal < peso)
      System.out.printf("\nAcima do peso ideal");
    else
      System.out.printf("\nAbaixo do peso ideal");

  }
}
