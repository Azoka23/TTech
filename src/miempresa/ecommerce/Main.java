package miempresa.ecommerce;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Intro intro = new Intro(sistema);
        intro.iniciar();
    }
}

