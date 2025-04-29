package miempresa.ecommerce;

import java.util.*;

public class Intro {
    private Scanner scanner;
    private Sistema sistema;

    public Intro(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bienvenido a la tienda en línea");
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIngrese su DNI: ");
            String dni = scanner.nextLine();
            Cliente cliente = sistema.obtenerCliente(dni);

            if (cliente == null) {
                System.out.println("Cliente no registrado. Por favor, ingrese sus datos:");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();

                cliente = new Cliente(nombre, apellido, email, dni, telefono);
                sistema.registrarCliente(cliente);
            }

            sistema.realizarCompra(cliente, scanner);

            System.out.print("\n¿Desea realizar otra compra con otro cliente? (s/n): ");
            continuar = scanner.nextLine().equalsIgnoreCase("s");
        }
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");
    }
}
