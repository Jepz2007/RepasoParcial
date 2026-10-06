import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cocina cocina1 = new Cocina(5);
        

        System.out.println("Le apoyaré a pedir su orden:");
        System.out.println("");

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Que tipo de pizza desea (Simple o Especial):");
        String tipo = scanner.nextLine();

        Orden.TipoPizza tipoPizza = Orden.TipoPizza.valueOf(tipo.trim().toUpperCase());

        double precio;
        if (tipoPizza == Orden.TipoPizza.SIMPLE){
            System.out.println("El precio es de: 35$");
            precio = 35;
        } else{
            System.out.println("El precio es de: 40$");
            precio = 40;
        }

        System.out.println("Su orden es la número: 1");
        int noOrden = 1;

        Orden orden1 = new Orden(nombre, tipoPizza, precio, noOrden);

        System.out.println("Orden:");
        System.out.println("");

        System.out.println("Cliente: "+ nombre);
        System.out.println("Tipo de Pizza"+ tipoPizza);
        System.out.println("Precio: "+precio);
        System.out.println("Número de Orden: "+noOrden);

        System.out.println("");
        System.out.println("¿Desea realizar la orden?(Y/N)");
        String respuesta = scanner.nextLine();

        if (respuesta.trim().equalsIgnoreCase("Y")) {
        if (cocina1.marcarPendiente(noOrden)) {
            orden1.hacerOrden();
        } else {
            System.out.println("La cocina ya tiene 5 órdenes pendientes");
        }
        } else {
            orden1.cancelarOrden();
}
   
    }
}
