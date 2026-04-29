public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private double monto;
    private boolean validado;
    private String mensajeError;

    public Pedido(String idPedido, Cliente cliente, double monto) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.monto = monto;
        this.validado = false;
        this.mensajeError = "";
    }

    public void validar() {
        if (cliente == null) {
            validado = false;
            mensajeError = "Error: el pedido no tiene cliente.";
            return;
        }

        if (cliente.getDni() == null || !cliente.getDni().matches("\\d{8}")) {
            validado = false;
            mensajeError = "Error: el DNI debe tener exactamente 8 digitos.";
            return;
        }

        if (monto <= 0) {
            validado = false;
            mensajeError = "Error: el monto del pedido debe ser mayor a cero.";
            return;
        }

        validado = true;
        mensajeError = "";
    }

    public String getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isValidado() {
        return validado;
    }

    public String getMensajeError() {
        return mensajeError;
    }
}