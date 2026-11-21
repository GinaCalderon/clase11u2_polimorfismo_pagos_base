public class PagoBilleteraDigital extends MetodoPago {

    private String proveedor;
    private String aliasUsuario;

    public PagoBilleteraDigital(String referencia, String titular,
            double montoBase, String proveedor,
            String aliasUsuario) {

        super(referencia, titular, montoBase);

        if (proveedor == null || proveedor.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El proveedor no puede estar vacío");
        }

        if (aliasUsuario == null || aliasUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El alias no puede estar vacío");
        }

        this.proveedor = proveedor;
        this.aliasUsuario = aliasUsuario;
    }

    @Override
    public double calcularComision() {
        return Math.min(montoBase * 0.015, 3.00);
    }

    @Override
    public String procesarPago() {
        return "Débito QR mediante " + proveedor
                + " | Usuario: " + aliasUsuario;
    }

    @Override
    public String mostrarComprobante() {
        return super.mostrarComprobante()
                + " | Proveedor: " + proveedor
                + " | Alias: " + aliasUsuario;
    }

    @Override
    public String toString() {
        return "PagoBilleteraDigital{" + super.toString()
                + ", proveedor='" + proveedor
                + "', aliasUsuario='" + aliasUsuario + "'}";
    }
}
