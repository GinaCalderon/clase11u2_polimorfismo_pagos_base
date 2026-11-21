public class PagoTransferencia extends MetodoPago {

    private String bancoOrigen;
    private String numeroComprobante;

    public PagoTransferencia(String referencia, String titular,
            double montoBase, String bancoOrigen,
            String numeroComprobante) {

        super(referencia, titular, montoBase);

        if (bancoOrigen == null || bancoOrigen.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El banco de origen no puede estar vacío");
        }

        if (numeroComprobante == null ||
                numeroComprobante.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El número de comprobante no puede estar vacío");
        }

        this.bancoOrigen = bancoOrigen;
        this.numeroComprobante = numeroComprobante;
    }

    @Override
    public double calcularComision() {
        return 0.50;
    }

    @Override
    public String procesarPago() {
        return "Transferencia realizada desde "
                + bancoOrigen + " | Comprobante: " + numeroComprobante;
    }

    @Override
    public String mostrarComprobante() {
        return super.mostrarComprobante()
                + " | Banco: " + bancoOrigen
                + " | Comprobante: " + numeroComprobante;
    }

    @Override
    public String toString() {
        return "PagoTransferencia{" + super.toString()
                + ", bancoOrigen='" + bancoOrigen
                + "', numeroComprobante='" + numeroComprobante + "'}";
    }
}
