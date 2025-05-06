package ejercicioClase8.com.techlab.clientes;


public class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + ", Email: " + email);
    }
}

