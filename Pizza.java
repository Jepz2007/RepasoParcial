enum Bases{
    MASA_MADRE,
    MASA_NORMAL
}

enum Salsas{
    NORMAL,
    PICANTE,
    AJO
}

enum Toppings{
    JAMON,
    PIMIENTOS,
    QUESO,
    PEPPERONI,
    CARNE
}
public class Pizza {
    private Bases base;
    private Salsas salsa;
    private Toppings topping;
    private String[] adicional;

    public Pizza(Bases base, Salsas salsa, Toppings topping, String[] adicional) {
        this.base = base;
        this.salsa = salsa;
        this.topping = topping;
        this.adicional = adicional;
    }

    public Pizza(Bases base, Salsas salsa, Toppings topping) {
        this.base = base;
        this.salsa = salsa;
        this.topping = topping;
    }

    public void hacerPizza(){

    }
    public void cocinarPizza(){
        
    }

}
