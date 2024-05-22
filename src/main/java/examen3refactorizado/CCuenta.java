/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen3refactorizado;

/**
 * Clase para gestionar cuentas bancarias
 * @author David Piedras Loureiro
 * @version 1.0
 * creado el 22/05/2024
 */
public class CCuenta {

    private double dSaldo;
    private String nombre;

/**
 * Método principal
 * @param args parámetros que se le pueden pasar por consola
 */
    public static void main(String[] args) {
        
        CCuenta cuenta1 = new CCuenta();
        double cantidad= 4000;
        System.out.println(cuenta1.ingresar(cantidad));

        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");

        operativa_cuenta(cuenta1, 0);
    
    }
/**
 * Método que realiza las operaciones que se le implementaron sobre la cuenta
 * @param cuenta1 la cuenta sobre la cual se hacen las operaciones
 * @param cantidad cantidad que se va a utilizar para las operaciones
 */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.getdSaldo() + " euros");
    }

/**
 * Método para hacer ingresos en la cuenta bancaria
 * @param cantidad cantidad a ingresar
 * @return código de error, puede ser 0 si no hay errores o 1 si no se puede hacer el ingreso
 */
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
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        } else {
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }

        return iCodErr;
    }

    /**
     * Método para hacer retiradas de saldo de dentro de la cuenta
     * @param cantidad la cantidad que se quiere retirar
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }

    /**
     * getter del parámetro dSaldo
     * @return valor actual de dSaldo
     */
    public double getdSaldo() {
        return dSaldo;
    }

    /**
     * setter de dSaldo
     * @param dSaldo valor que queremos que tome dSaldo
     */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * getter de nombre
     * @return valor actual del parámetro nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     * @param nombre el valor que queremos que tome nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
