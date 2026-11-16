/**
 * Subclase para pagos por transferencia bancaria (tarifa fija de $0.50).
 */
public class PagoTransferencia /* TODO 1: extends MetodoPago */ {
    private String bancoOrigen;
    private String numeroComprobante;

    public PagoTransferencia(String referencia, String titular, double montoBase, String bancoOrigen, String numeroComprobante) {
        // TODO 2: Invocar super(...) y validar bancoOrigen y numeroComprobante
    }

    // TODO 3: Sobreescribir @Override calcularComision() retornando 0.50

    // TODO 4: Sobreescribir @Override procesarPago() indicando banco y número de comprobante

    // TODO 5: Sobreescribir @Override mostrarComprobante() extendiendo super.mostrarComprobante()

    // TODO 6: Sobreescribir @Override toString() extendiendo super.toString()
}
