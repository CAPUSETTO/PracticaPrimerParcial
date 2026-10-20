

public class main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado",25000,10);

        System.out.println("DATOS DEL PRODUCTO!");
        p1.mostrarDatos();

        p1.actualizarStock(-5);

        System.out.println("DATOS DEL PRODUCTO!");
        p1.mostrarDatos();

    }
}