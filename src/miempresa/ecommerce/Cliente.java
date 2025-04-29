
package miempresa.ecommerce;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private String telefono;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String nombre, String apellido, String email, String dni, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido +
                "\nDNI: " + dni +
                "\nEmail: " + email +
                "\nTeléfono: " + telefono;
    }
}
