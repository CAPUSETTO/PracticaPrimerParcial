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

    public String setNombre(String nombre){
        this.nombre = nombre;
    }

    public double setPrecio(double precio){
        if (precio > 0) {
            
        }
    }

}
