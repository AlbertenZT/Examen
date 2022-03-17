
package local;

/**
 *
 * @author Alberto Zaragosi
 */
public class Coche extends Vehiculo{
    int plazas;
    
    public Coche() {
        this.plazas = 5;
    }
    
    public Coche(int plazas) {
        this.plazas = plazas;
    }
    

    public int getPlazas() {
        return plazas;
    }

    @Override
    public void imprimir_Basico() {
        System.out.println("TIPO: COCHE");
        System.out.println("PLAZAS: "+getPlazas());
    }

    @Override
    public void imprimir_extendido(int horas) {
        imprimir_Basico();
        int coste =60*horas;
        System.out.println("Precio: "+coste);
    }
    
    
    
    

    
}
