public class RegistrarPedidoService {
    private FacturaService facturaService;

    public RegistrarPedidoService(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    public void registrarPedido(Pedido pedido) {
        pedido.validar();

        if (!pedido.isValidado()) {
            System.out.println(pedido.getMensajeError());
            return;
        }

        System.out.println("Pedido registrado correctamente: " + pedido.getIdPedido());

        facturaService.emitirFactura(pedido.getCliente(), pedido.getMonto());

        mostrarEstadoFactura(pedido);
    }

    private void mostrarEstadoFactura(Pedido pedido) {
        if (facturaService.verificarEstado()) {
            System.out.println("Factura generada correctamente.");
            System.out.println("Cliente: " + pedido.getCliente().getNombre());
            System.out.println("Monto facturado: S/ " + pedido.getMonto());
        } else {
            System.out.println("Error: no se pudo generar la factura.");
        }
    }
}