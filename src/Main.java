import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MetodoPago> lotePagos = new ArrayList<>();

        lotePagos.add(
                new PagoEfectivo("PAG-101", "Carol Suntaxi", 45.00, 50.00));

        lotePagos.add(
                new PagoTarjeta("PAG-102", "Mateo Gualotuña", 120.00,
                        "5678", "Visa"));

        lotePagos.add(
                new PagoTransferencia("PAG-103", "Natalia Coyago", 85.00,
                        "Banco Pichincha", "TRX-7890"));

        lotePagos.add(
                new PagoBilleteraDigital("PAG-104", "Carol Suntaxi", 160.00,
                        "Naranja X", "carols12"));

        double totalComisiones = 0.0;
        double totalRecaudado = 0.0;

        for (MetodoPago pago : lotePagos) {

            System.out.println("----------------------------------------");

            System.out.println(pago.procesarPago());

            System.out.println(pago.mostrarComprobante());

            System.out.println(pago);

            totalComisiones += pago.calcularComision();
            totalRecaudado += pago.calcularTotal();
        }

        System.out.println("----------------------------------------");

        System.out.printf("Total de comisiones: $%.2f%n",
                totalComisiones);

        System.out.printf("Total recaudado: $%.2f%n",
                totalRecaudado);
    }
}
