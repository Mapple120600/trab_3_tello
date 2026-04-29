public interface FacturaService {
    void emitirFactura(Cliente cliente, double monto);
    boolean verificarEstado();
}