package aplicacionbancaria;

public class Transacciones {
    private String transaccionID;
    private String cuentaOrigen;
    private String cuentaDestino;
    private double montoTransaccion;
    private String tipoTransaccion;

    public Transacciones(String transaccionID, String cuentaOrigen, String cuentaDestino, double montoTransaccion, String tipoTransaccion) {
        this.transaccionID = transaccionID;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.montoTransaccion = montoTransaccion;
        this.tipoTransaccion = tipoTransaccion;
    }
    
    
    public String getTransaccionID() {
        return transaccionID;
    }

    public void setTransaccionID(String transaccionID) {
        this.transaccionID = transaccionID;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
    public void procesarTransaccion(Cuenta usuario){
        
    };
    
}
