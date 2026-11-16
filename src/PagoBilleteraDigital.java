/**
 * Subclase para pagos por billetera digital (1.5% con tope máximo de $3.00).
 */
public class PagoBilleteraDigital /* TODO 1: extends MetodoPago */ {
    private String proveedor;
    private String aliasUsuario;

    public PagoBilleteraDigital(String referencia, String titular, double montoBase, String proveedor, String aliasUsuario) {
        // TODO 2: Invocar super(...) y validar proveedor y aliasUsuario
    }

    // TODO 3: Sobreescribir @Override calcularComision() -> Math.min(montoBase * 0.015, 3.00)

    // TODO 4: Sobreescribir @Override procesarPago() indicando débito QR del proveedor y alias

    // TODO 5: Sobreescribir @Override mostrarComprobante() extendiendo super.mostrarComprobante()

    // TODO 6: Sobreescribir @Override toString() extendiendo super.toString()
}
