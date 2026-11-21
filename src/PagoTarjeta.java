public class PagoTarjeta extends MetodoPago {

    private String ultimosCuatroDigitos;
    private String franquicia;

    public PagoTarjeta(String referencia, String titular,
            double montoBase, String ultimosCuatroDigitos,
            String franquicia) {

        super(referencia, titular, montoBase);

        if (ultimosCuatroDigitos == null ||
                !ultimosCuatroDigitos.matches("\\d{4}")) {
            throw new IllegalArgumentException(
                    "Debe ingresar exactamente cuatro dígitos");
        }

        if (franquicia == null || franquicia.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La franquicia no puede estar vacía");
        }

        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
        this.franquicia = franquicia;
    }

    @Override
    public double calcularComision() {
        return montoBase * 0.035;
    }

    @Override
    public String procesarPago() {
        return "Pago con tarjeta " + franquicia
                + " ****" + ultimosCuatroDigitos + " aprobado";
    }

    @Override
    public String mostrarComprobante() {
        return super.mostrarComprobante()
                + " | Franquicia: " + franquicia
                + " | Tarjeta: ****" + ultimosCuatroDigitos;
    }

    @Override
    public String toString() {
        return "PagoTarjeta{" + super.toString()
                + ", franquicia='" + franquicia
                + "', tarjeta='****" + ultimosCuatroDigitos + "'}";
    }
}
