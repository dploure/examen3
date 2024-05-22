/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ccuenta;

/**
 *
 * @author David Piedras Loureiro
 */
public class CCuenta {
    // Propiedades de la Clase Cuenta
    public double dSaldo;
    public String nombre;

    public static void main(String[] args) {
        
        CCuenta miCuenta = new CCuenta();
        double cantidad= 4000;
        System.out.println(miCuenta.ingresar(cantidad));

        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros"); 
    
    }

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
    public int ingresar(double cantidad) {
        int iCodErr;

        //Corregimos el if ya que tenia un error de lógica, y lo separamos en dos condiciones if ya que se solapaba si cantidad era mayor que 3000, cumplía dos condiciones.
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        }
        // modificamos el = por >= para que tenga coherencia con el mensaje
        else if (cantidad >= 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
