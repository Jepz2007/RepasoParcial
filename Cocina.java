public class Cocina {
   private int[] ordenesPendientes = new int[5];
   private int ordenesListas;
   private int noCocineros;

   public Cocina(int noCocineros) {
    this.noCocineros = noCocineros;
   }

   public boolean marcarPendiente(int numeroOrden){
        for (int i = 0; i < ordenesPendientes.length; i++) {
        if (ordenesPendientes[i] == 0) {
            ordenesPendientes[i] = numeroOrden;
            return true;
        }
    }
    return false;
   }
   public void marcarLista(){

   }
   public void repetirPizza(){

   }

}
