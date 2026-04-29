import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE PEDIDOS ===");

        System.out.print("Ingrese ID del pedido: ");
        String idPedido = scanner.nextLine();

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese DNI del cliente: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese monto del pedido: ");
        double monto = scanner.nextDouble();

        Cliente cliente = new Cliente(nombre, dni);

        Pedido pedido = new Pedido(idPedido, cliente, monto);

        LegacyBillingSystem legacyBillingSystem = new LegacyBillingSystem();

        FacturaService facturaService = new BillingAdapter(legacyBillingSystem);

        RegistrarPedidoService registrarPedidoService =
                new RegistrarPedidoService(facturaService);

        registrarPedidoService.registrarPedido(pedido);

        scanner.close();
    }
}