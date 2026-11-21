public class PagoEfectivo extends MetodoPago {

    private double montoEntregado;

    public PagoEfectivo(String referencia, String titular,
            double montoBase, double montoEntregado) {

        super(referencia, titular, montoBase);

        if (montoEntregado < montoBase) {
            throw new IllegalArgumentException(
                    "El monto entregado no puede ser menor al monto base");
        }

        this.montoEntregado = montoEntregado;
    }

    public double calcularVuelto() {
        return montoEntregado - calcularTotal();
    }

    @Override
    public double calcularComision() {
        return 0.0;
    }

    @Override
    public String procesarPago() {
        return String.format(
                "Pago en efectivo confirmado. Vuelto: $%.2f",
                calcularVuelto());
    }

    @Override
    public String mostrarComprobante() {
        return super.mostrarComprobante()
                + String.format(
                        " | Entregado: $%.2f | Vuelto: $%.2f",
                        montoEntregado, calcularVuelto());
    }

    @Override
    public String toString() {
        return "PagoEfectivo{" + super.toString()
                + String.format(
                        ", montoEntregado=%.2f, vuelto=%.2f}",
                        montoEntregado, calcularVuelto());
    }
}
