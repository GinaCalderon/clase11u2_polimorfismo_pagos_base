import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para probar el polimorfismo con una colección de MetodoPago.
 * PASO FINAL: Instanciar las subclases dentro de List<MetodoPago> y recorrerlas
 * sin usar condicionales if/else por tipo de objeto.
 */
public class Main {
    public static void main(String[] args) {
        List<MetodoPago> lotePagos = new ArrayList<>();

        // TODO 1: Agregar al menos un objeto de cada subclase a lotePagos:
        // PagoEfectivo, PagoTarjeta, PagoTransferencia y PagoBilleteraDigital

        // TODO 2: Recorrer lotePagos con un ciclo for-each de tipo MetodoPago
        // Imprimir pago.procesarPago(), pago.mostrarComprobante() y pago (toString)
        // Acumular totalComisiones y totalRecaudado polimórficamente
    }
}
