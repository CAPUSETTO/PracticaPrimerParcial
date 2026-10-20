public class Producto {
    private String nombre;
    private double precio;
    private Integer stock;
    
    public Producto (String nombre, double precio, Integer stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public Integer getStock(){
        return stock;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio <= 0) {
            System.out.println("El precio es menor a 0!");
            this.precio = 0.0;
        }

        this.precio = precio;
    }

    public void setStock(Integer stock){
        if (stock <= 0) {
            System.out.println("El stock es menor a 0!");
            this.stock = 0;
        }

        this.stock = stock;
    }

    public void actualizarStock (Integer cantidad){
        if (stock + cantidad >= 0) {
            stock += cantidad;
        } else {
            System.out.println("Error el stock no puede ser negativo!");
        }
    }

    public void mostrarDatos (){
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:  " + stock);
    }

}
