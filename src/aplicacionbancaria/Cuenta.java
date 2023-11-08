package aplicacionbancaria;

public class Cuenta {
    private String nroCuenta;
    private String usuario;
    private String contrasena;
    private double balance;
    private boolean loggedIn;
    private String nombreUsuario, dni, nroCelular;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

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
    
    public void registroUsuario(String nombreUsuario, String dni, String nroCelular){
        System.out.println("\tRegistro de usuario");
        System.out.print("Ingrese nombre y apellido: ");
        System.out.print("Ingrese su numero de telefono: ");
        System.out.print("Ingrese su DNI: ");
        
        System.out.println("Bienvenido, "+ this.nombreUsuario+ "!");
    }
    
    public void cambioContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public boolean logIn(String enteredPassword) {
        if (!loggedIn && enteredPassword.equals(this.contrasena)) {
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
}
