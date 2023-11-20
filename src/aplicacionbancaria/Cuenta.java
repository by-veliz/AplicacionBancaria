package aplicacionbancaria;

import java.util.Scanner;

public class Cuenta{
    private String nroCuenta;
    private String usuario;
    private String contrasena;
    private double balance;
    private int opcion;
    private boolean loggedIn;
    private String dni, nroCelular;
    Scanner teclado = new Scanner(System.in);

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNroCelular() {
        return nroCelular;
    }
    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
   
    
    public void cambioContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public boolean logIn(String contrasenaLogIn) {
        if (!loggedIn && contrasenaLogIn.equals(this.contrasena)) {
            loggedIn = true;
            System.out.println("Bienvenido, " + this.usuario + "!");
            return true;
        } else {
            System.out.println("Ingreso denegado.");
            return false;
        }
    }
    
    public void logOut(){
        if (loggedIn) {
            loggedIn = false;
            System.out.println("Sesion Terminada");
        }
    }

    public void registrarCuenta() {
        System.out.println("\tRegistro de usuario");
        System.out.print("Ingrese nombre y apellido: ");
        this.usuario = teclado.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        this.nroCelular = teclado.nextLine();
        System.out.print("Ingrese su DNI: ");
        this.dni = teclado.nextLine();
        System.out.print("Crea una contrasena segura: ");
        this.contrasena = teclado.nextLine();
        System.out.println("\nBienvenido, "+ this.usuario+ "!");
        
        //DE AQUI PARA ADELANTE, YA TENÍA SUEÑO Y ESTABA VOLANDO, SO PUSE TIPO UNA BASE
        //NO ME FUNEN :c
        System.out.println("\n1. Consultar tu cuenta");
        System.out.println("2. Hacer alguna Transaccion ");
        System.out.println("3. Solicitar un Prestamo");
        
        
        System.out.print("Ingrese la opcion: ");
        opcion = teclado.nextInt();
                
        switch(opcion){
            case 1: System.out.println("Elegiste Consultar Cuenta");
            case 2: System.out.println("Elegiste Transacciones");
            case 3: System.out.println("Elegiste Prestamos");
                    Prestamos prestamo = new Prestamos();
                    prestamo.generarEstadoPrestamo();
                    break;
            default: System.out.println("Opcion no valida ");
        }
    }
}
