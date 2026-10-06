

public class Orden {
    enum TipoPizza{
    SIMPLE,
    ESPECIAL
    }   
    private String nombre;
    private TipoPizza tipoPizza;
    private double precio;
    private int noOrden;

    public Orden(String orden, TipoPizza tipoPizza, double precio, int noOrden) {
        this.nombre = orden;
        this.tipoPizza = tipoPizza;
        this.precio = precio;
        this.noOrden = noOrden;
    }

    public void hacerOrden(){
        System.out.println("Orden Realizada");
    }
    public void cancelarOrden(){
        System.out.println("Orden Cancelada");
    }

    
}
