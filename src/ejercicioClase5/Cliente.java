package ejercicioClase5;


public class Cliente {
    String nombre;
    String email;

    // Constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrar() {
        System.out.println("Cliente: " + nombre + " | Email: " + email);
    }
}


