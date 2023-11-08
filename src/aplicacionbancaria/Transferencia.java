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
public class Transferencia extends Transacciones{
    public Transferencia(String transaccionID, String cuentaOrigen, String cuentaDestino, double montoTransaccion, String tipoTransaccion) {
        super(transaccionID, cuentaOrigen, cuentaDestino, 0, "Transferencia");
    }
    @Override
    public void procesarTransaccion(Cuenta usuario){
        Scanner input=new Scanner(System.in);
        double ultimoBalance = usuario.getBalance();
        double montoTranferencia = input.nextDouble();
        double newBalance = ultimoBalance - montoTranferencia; 
        usuario.setBalance(newBalance);
    }
}
