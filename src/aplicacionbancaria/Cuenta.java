package aplicacionbancaria;

import java.util.Scanner;

public class Cuenta implements Mostrar{
    private String nroCuenta;
    private String usuario;
    private String contrasena;
    private double balance;
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

    @Override
    public void mostrar() {
        System.out.println("\tRegistro de usuario");
        System.out.print("Ingrese nombre y apellido: ");
        usuario = teclado.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        nroCelular = teclado.nextLine();
        System.out.print("Ingrese su DNI: ");
        dni = teclado.nextLine();
        System.out.print("Crea una contrasena segura: ");
        contrasena = teclado.nextLine();
        System.out.println("\nBienvenido, "+ this.usuario+ "!");

    }
}
