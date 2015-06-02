/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcalcusimpl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author acarreiragonzalez
 */
@RunWith(Parameterized.class)
public class MainTest {

    private float num1, num2, expRes;
    private String ope;

    @Before
    public void initialize() {

    }

    public MainTest(float no1, float no2, String ope, float result) {
        this.num1 = no1;
        this.num2 = no2;
        this.ope = ope;
        this.expRes = result;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {1.0f, 2.0f, "Sumar", 3},
            {2, 3, "Multiplicar", 6},
            {8, 5, "Restar", 3},
            {10, 2, "Dividir", 5}
        });
    }

    /**
     * Test of realizaOperacion method, of class Main.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("Parameterized Number is : " + num1 + " " + num2 + " ---> " + ope);
        assertEquals(expRes,
                Main.realizaOperacion(num1, num2, ope),0.0);
    }

}
