package aplicacionbancaria;

public class Cuenta {
    private String nroCuenta;
    private String usuario;
    private String contrasena;
    private double balance;
    private boolean loggedIn;


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
        
    }
}
