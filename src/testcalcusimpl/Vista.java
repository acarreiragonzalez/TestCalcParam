/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcalcusimpl;

import java.util.Scanner;

/**
 *
 * @author oracle
 */
public class Vista {

    public static void entrada(Modelo mo) {

        System.out.println("Introduza a operación que  desexe\nSumar\nRestar\nMultiplicar\nDividir\n");
        Scanner dato = new Scanner(System.in);
        mo.setOperacion(dato.nextLine());
        System.out.println("Introduce o primeiro numero");
        Scanner num = new Scanner(System.in);
        mo.setNum1(num.nextFloat());
        System.out.println("Introduce o segundo numero");
        Scanner num1 = new Scanner(System.in);
        mo.setNum2(num1.nextFloat());

    }

    public static void saida(Modelo mo) {
        System.out.println(mo);
    }
}
