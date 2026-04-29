public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private double monto;

    public Pedido(String idPedido, Cliente cliente, double monto) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.monto = monto;
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
}