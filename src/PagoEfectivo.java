/**
 * Subclase para pagos en efectivo.
 * PASO 2: Aplicar herencia (extends MetodoPago) y sobreescribir métodos con @Override.
 */
public class PagoEfectivo /* TODO 1: extends MetodoPago */ {
    private double montoEntregado;

    public PagoEfectivo(String referencia, String titular, double montoBase, double montoEntregado) {
        // TODO 2: Invocar super(referencia, titular, montoBase)
        // TODO 3: Validar que montoEntregado >= montoBase y asignarlo
    }

    public double calcularVuelto() {
        // TODO 4: Retornar montoEntregado - calcularTotal()
        return 0.0;
    }

    // TODO 5: Sobreescribir @Override calcularComision() retornando 0.0

    // TODO 6: Sobreescribir @Override procesarPago() indicando confirmación y vuelto

    // TODO 7: Sobreescribir @Override mostrarComprobante() reutilizando super.mostrarComprobante()

    // TODO 8: Sobreescribir @Override toString() reutilizando super.toString()
}
