

package ejercicioClase4;

public class Main {

    public static void main(String[] args) {

        // 1. calcularImpuesto
        System.out.println("--- Cálculo de impuesto ---");
        System.out.println("Precio final: $" + calcularImpuesto(100, 21));
        System.out.println("Precio final: $" + calcularImpuesto(250, 10));

        /* ¿Qué hace?
Calcula el precio final de un producto después de sumarle el impuesto.
🔹 Parámetros:
precio: el valor original del producto (por ejemplo, $100)
porcentajeImpuesto: el porcentaje de impuesto que se aplica (por ejemplo, 21%)
🔹 Devuelve:
El precio final con el impuesto incluido.
🔹 Ejemplo:
Si el producto cuesta 100 y el impuesto es 21%, te devuelve 121.
 */
        // 2. calcularPrecioFinal
        System.out.println("\n--- Cálculo de precio final ---");
        double total = calcularPrecioFinal(200, 10, 60);
        System.out.println("Total con descuento aplicado: $" + total);
/*¿Qué hace?
Calcula el precio total de varios productos con descuento.
🔹 Parámetros:
precio: cuánto cuesta cada unidad.
descuento: porcentaje de descuento.
cantidad: cuántas unidades vas a comprar.
🔹 Regla extra:
Si comprás más de 50 unidades, el descuento aumenta 5%.
🔹 Ejemplo:
Comprás 60 productos de $200 con 10% de descuento.
Como son más de 50 → el descuento es de 15%.
Entonces: cada producto cuesta $170 y el total es $170 × 60 = $10.200.
 */
        // 3. Paso por valor
        System.out.println("\n--- Stock antes y después ---");
        int[] stock = {10, 20, 30};
        System.out.print("Stock antes: ");

        //for each - Para cada elemento s dentro del array stock, imprimí ese elemento
        // seguido de un espacio
        /* for (int i = 0; i < stock.length; i++) {
    System.out.print(stock[i] + " ");
}
*/
        reponerStock(stock, 1, 15); // Reponemos 15 unidades al producto 2
        System.out.print("\nStock después: ");
        for (int s : stock) System.out.print(s + " ");

        /* ¿Qué hace?
Aumenta la cantidad de stock de un producto específico en una lista.
🔹 Parámetros:
stock: un array con los stocks de varios productos.
indice: cuál producto querés modificar (0 = primero, 1 = segundo, etc.).
cantidad: cuántas unidades querés agregar.
🔹 Ejemplo:
Si tenés stock = {10, 20, 30} y hacés reponerStock(stock, 1, 15),
el nuevo stock será {10, 35, 30} porque agregaste 15 al segundo producto.
🧠 Esto muestra cómo se modifica un array al pasarlo a un método (por referencia).
*/

        // 4. Sobrecarga de métodos
        System.out.println("\n\n--- Mensajes ---");
        mostrarMensaje("¡Bienvenido, nuevo cliente!");
        mostrarMensaje("¡Gracias por seguir comprando!", 3);
    }
/* ¿Qué hace?
Imprime un mensaje en pantalla. Hay dos versiones del mismo método:
🟦 Versión 1: Recibe solo un String
👉 Se usa cuando solo querés mostrar una vez el mensaje.
Ejemplo: mostrarMensaje("¡Hola!") → muestra: Mensaje: ¡Hola!
🟦 Versión 2: Recibe un String y un int
👉 Imprime ese mensaje varias veces.
Ejemplo: mostrarMensaje("Gracias por comprar", 3) → lo muestra 3 veces.
🔄 ¿Y por qué hay dos métodos con el mismo nombre?
Porque Java permite "sobrecargar" métodos:
Si tienen distintos parámetros, podés usar el mismo nombre pero con funciones diferentes. Es muy útil para simplificar el código.*/

    // Funciones - Calcular impuesto
    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        return precio + (precio * porcentajeImpuesto / 100);
    }

    // Funciones y argumentos - calcular precio final
    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5;
        }
        double precioConDescuento = precio - (precio * descuento / 100);
        return precioConDescuento * cantidad;
    }

    // Paso por valor - reponer stock
    public static void reponerStock(int[] stock, int indice, int cantidad) {
        if (indice >= 0 && indice < stock.length) {
            stock[indice] += cantidad;
        }
    }

    // Sobrecarga de métodos - mostrar mensaje (solo String)
    public static void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // Sobrecarga de métodos - mostrar mensaje (String + int)
    public static void mostrarMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Mensaje " + (i + 1) + ": " + mensaje);
        }
    }
}



