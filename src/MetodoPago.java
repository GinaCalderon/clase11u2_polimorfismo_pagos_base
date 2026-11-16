/**
 * Superclase base para el sistema de pagos polimórficos.
 * PASO 1: Revisa los atributos protegidos y los métodos definidos aquí.
 * Luego, las subclases deberán heredar de MetodoPago y redefinir los métodos
 * indicados usando @Override.
 */
public class MetodoPago {
    // TODO 1: Declarar atributos protected: referencia (String), titular (String), montoBase (double)

    public MetodoPago(String referencia, String titular, double montoBase) {
        // TODO 2: Validar que referencia y titular no estén vacíos y montoBase > 0
        // Luego asignar los valores a los atributos de la clase
    }

    public double calcularComision() {
        return 0.0;
    }

    public double calcularTotal() {
        return 0.0; // TODO 3: Retornar montoBase + calcularComision()
    }

    public String procesarPago() {
        return "Procesando pago genérico";
    }

    public String mostrarComprobante() {
        // TODO 4: Retornar una cadena con referencia, titular, base, comisión y total
        return "";
    }

    // TODO 5: Sobreescribir @Override public String toString() con un resumen compacto
}
