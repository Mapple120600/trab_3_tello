public class LegacyBillingSystem {
    private boolean comprobanteEmitido;

    public LegacyBillingSystem() {
        this.comprobanteEmitido = false;
    }

    public void iniciarBoleta(String compradorId) {
        System.out.println("LegacyBillingSystem: iniciando boleta para " + compradorId);
    }

    public void asignarMonto(String montoStr) {
        System.out.println("LegacyBillingSystem: asignando monto S/ " + montoStr);
    }

    public void confirmarEmision() {
        System.out.println("LegacyBillingSystem: confirmando emision del comprobante");
        comprobanteEmitido = true;
    }

    public boolean obtenerCodigoEstado() {
        System.out.println("LegacyBillingSystem: consultando estado de emision");
        return comprobanteEmitido;
    }
}