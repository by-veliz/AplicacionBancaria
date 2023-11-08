package aplicacionbancaria;

public class Transacciones {
    private float transaccion;
    private float cuentaOrigen;
    private float cuentaDestino;
    private float montoTransaccion;
    private float tipoTransaccion;

    public float getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(float transaccion) {
        this.transaccion = transaccion;
    }

    public float getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(float cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public float getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(float cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public float getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(float montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public float getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(float tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
}
