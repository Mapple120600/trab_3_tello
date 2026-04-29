public class BillingAdapter implements FacturaService {
    private LegacyBillingSystem legacyBillingSystem;

    public BillingAdapter(LegacyBillingSystem legacyBillingSystem) {
        this.legacyBillingSystem = legacyBillingSystem;
    }

    @Override
    public void emitirFactura(Cliente cliente, double monto) {
        legacyBillingSystem.iniciarBoleta(cliente.getNombre());
        legacyBillingSystem.asignarMonto(String.valueOf(monto));
        legacyBillingSystem.confirmarEmision();
    }

    @Override
    public boolean verificarEstado() {
        return legacyBillingSystem.obtenerCodigoEstado();
    }
}