/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ccuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author persona
 */
public class CCuentaTest {
    
    CCuenta instance = new CCuenta();
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() {
        System.out.println("menor que cero");
        double cantidad = -1;
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresar2() {
        System.out.println("mayor que cero menor que 3000");
        double cantidad = 100;
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresar3() {
        System.out.println("mayor que 3000");
        double cantidad = 4000;
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    

}
