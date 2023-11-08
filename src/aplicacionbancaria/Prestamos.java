package aplicacionbancaria;

public class Prestamos {
    private String prestamoID;
    private double montoPrestamo;
    private double montoCuotas;
    private double TasaInteres;
    private double BalancePrestamo;
    private int cantidadCuotas;
    private int prestamoPlazo;

    public Prestamos(String prestamoID, double montoPrestamo, double TasaInteres, double BalancePrestamo, int cuotasPrestamo, int prestamoPlazo) {
        this.prestamoID = prestamoID;
        this.montoPrestamo = montoPrestamo;
        this.TasaInteres = TasaInteres;
        this.BalancePrestamo = BalancePrestamo;
        this.cantidadCuotas = cuotasPrestamo;
        this.prestamoPlazo = prestamoPlazo;
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
        this.montoPrestamo = montoPrestamo;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public double getBalancePrestamo() {
        return BalancePrestamo;
    }

    public void setBalancePrestamo(double BalancePrestamo) {
        this.BalancePrestamo = BalancePrestamo;
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
        this.montoCuotas = montoCuotas;
    }
    
    
    public void calcularCuotasPrestamo(){
        double interesMensual = TasaInteres / 12 / 100; 

        this.montoCuotas = montoPrestamo * (interesMensual * Math.pow(1 + interesMensual, cantidadCuotas))
                / (Math.pow(1 + interesMensual,cantidadCuotas) - 1);

    }
    
    public void pagarPrestamo(Cuenta Usuario){
        this.BalancePrestamo -= this.montoCuotas;
        Usuario.setBalance(Usuario.getBalance() - this.montoCuotas);
    }
    
    public void generarEstadoPrestamo(){
        System.out.println("Prestamo ID: " + prestamoID);
        System.out.println("Monto del Prestamo: $/" + montoPrestamo);
        System.out.println("Balance del Prestamo: $/" + BalancePrestamo);
    }               
}
