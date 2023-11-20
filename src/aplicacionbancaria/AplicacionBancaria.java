package aplicacionbancaria;

public class AplicacionBancaria {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.registrarCuenta();
        
        // GUI de la app
        LogIn logIn=new LogIn();
        logIn.setVisible(true);
    }
    
}
