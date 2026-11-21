public class MetodoPago {

    protected String referencia;
    protected String titular;
    protected double montoBase;

    public MetodoPago(String referencia, String titular, double montoBase) {
        if (referencia == null || referencia.trim().isEmpty()) {
            throw new IllegalArgumentException("La referencia no puede estar vacía");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        if (montoBase <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
        this.referencia = referencia;
        this.titular = titular;
        this.montoBase = montoBase;
    }

    public double calcularComision() {
        return 0.0;
    }

    public double calcularTotal() {
        return montoBase + calcularComision();
    }

    public String procesarPago() {
        return "Procesando pago genérico";
    }

    public String mostrarComprobante() {
        return String.format(
                "Referencia: %s | Titular: %s | Base: $%.2f | Comisión: $%.2f | Total: $%.2f",
                referencia,
                titular,
                montoBase,
                calcularComision(),
                calcularTotal());
    }

    @Override
    public String toString() {
        return String.format(
                "MetodoPago{referencia='%s', titular='%s', montoBase=%.2f, comision=%.2f, total=%.2f}",
                referencia,
                titular,
                montoBase,
                calcularComision(),
                calcularTotal());
    }
}