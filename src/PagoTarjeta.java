/**
 * Subclase para pagos con tarjeta de crédito o débito (comisión 3.5%).
 */
public class PagoTarjeta /* TODO 1: extends MetodoPago */ {
    private String ultimosCuatroDigitos;
    private String franquicia;

    public PagoTarjeta(String referencia, String titular, double montoBase, String ultimosCuatroDigitos, String franquicia) {
        // TODO 2: Invocar super(...) y validar que ultimosCuatroDigitos tenga longitud 4
    }

    // TODO 3: Sobreescribir @Override calcularComision() -> 3.5% de montoBase (montoBase * 0.035)

    // TODO 4: Sobreescribir @Override procesarPago() mostrando franquicia y ****digitos

    // TODO 5: Sobreescribir @Override mostrarComprobante() extendiendo super.mostrarComprobante()

    // TODO 6: Sobreescribir @Override toString() extendiendo super.toString()
}
