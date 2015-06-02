/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcalcusimpl;


public class Main {

    static Modelo mod = new Modelo();

    public static void main(String[] args) {
        Vista.entrada(mod);
        mod.setResultado(Main.realizaOperacion(mod.getNum1(), mod.getNum2(), mod.getOperacion()));
        Vista.saida(mod);
    }

    public static float realizaOperacion(float num1, float num2, String ope) {

        float resul = 0;
        if ("Sumar ->".equals(ope)) {
            resul = (num1 + num2);
            mod.setResultado(resul);
            return resul;
        }
        if ("Restar->".equals(ope)) {
            resul = num1 - num2;
            mod.setResultado(resul);
            return resul;
        }
        if ("Multiplicar->".equals(ope)) {
            resul = num1 * num2;
            mod.setResultado(resul);
            return resul;
        }
        if ("Dividir->".equals(ope)) {
            resul = num1 / num2;
            mod.setResultado(resul);
            return resul;
        }
        return resul;

    }

}
