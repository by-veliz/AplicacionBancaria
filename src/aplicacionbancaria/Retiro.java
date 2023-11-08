/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionbancaria;

import java.util.Scanner;

/**
 *
 * @author byvel
 */
public class Retiro extends Transacciones{

    public Retiro(String transaccionID, String cuentaOrigen, String cuentaDestino, double montoTransaccion, String tipoTransaccion) {
        super(transaccionID, cuentaOrigen, null, 0, "Retiro");
    }
    @Override
    public void procesarTransaccion(Cuenta usuario){
        Scanner input=new Scanner(System.in);
        double ultimoBalance = usuario.getBalance();
        double retiro = input.nextDouble();
        double newBalance = ultimoBalance - retiro; 
        usuario.setBalance(newBalance);
    }
}
