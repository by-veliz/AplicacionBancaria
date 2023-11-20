package aplicacionbancaria;

import java.util.Scanner;

public class Prestamos {
    private String prestamoID;
    private float montoPrestamo;
    private float montoCuotas;
    private float TasaInteres;
    private float BalancePrestamo;
    private int cantidadCuotas;
    private int prestamoPlazo;
    Scanner teclado = new Scanner(System.in);

    public Prestamos(String prestamoID, double montoPrestamo, double TasaInteres, double BalancePrestamo, int cuotasPrestamo, int prestamoPlazo) {
        this.prestamoID = prestamoID;
        this.montoPrestamo = (float) montoPrestamo;
        this.TasaInteres = (float) TasaInteres;
        this.BalancePrestamo = (float) BalancePrestamo;
        this.cantidadCuotas = cuotasPrestamo;
        this.prestamoPlazo = prestamoPlazo;
    }

    Prestamos() {
        System.out.print("Ingrese su ID de prestamos: ");
        prestamoID = teclado.nextLine();
        System.out.print("Ingrese el monto que desea para el prestamo: S/.");
        montoPrestamo = teclado.nextFloat();
        System.out.print("Ingrese el balance(no entendi a q se referia :c): S/.");
        BalancePrestamo = teclado.nextFloat();
    }

    public String getPrestamoID() {
        return prestamoID;
    }

    public void setPrestamoID(String prestamoID) {
        this.prestamoID = prestamoID;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = (float) montoPrestamo;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = (float) TasaInteres;
    }

    public double getBalancePrestamo() {
        return BalancePrestamo;
    }

    public void setBalancePrestamo(double BalancePrestamo) {
        this.BalancePrestamo = (float) BalancePrestamo;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getPrestamoPlazo() {
        return prestamoPlazo;
    }

    public void setPrestamoPlazo(int prestamoPlazo) {
        this.prestamoPlazo = prestamoPlazo;
    }

    public double getMontoCuotas() {
        return montoCuotas;
    }

    public void setMontoCuotas(double montoCuotas) {
        this.montoCuotas = (float) montoCuotas;
    }
    
    
    public void calcularCuotasPrestamo(){
        double interesMensual = TasaInteres / 12 / 100; 

        this.montoCuotas = (float) (montoPrestamo * (interesMensual * Math.pow(1 + interesMensual, cantidadCuotas))
                / (Math.pow(1 + interesMensual,cantidadCuotas) - 1));

    }
    
    public void pagarPrestamo(Cuenta Usuario){
        this.BalancePrestamo -= this.montoCuotas;
        Usuario.setBalance(Usuario.getBalance() - this.montoCuotas);
    }
    
    public void generarEstadoPrestamo(){
        System.out.println("\n");
        System.out.println("\tPrestamo");
        System.out.println("\nPrestamo ID: " + prestamoID);
        System.out.println("Monto del Prestamo: $/" + montoPrestamo);
        System.out.println("Balance del Prestamo: $/" + BalancePrestamo);
    }               
}
