
package local;

/**
 *
 * @author Alberto Zaragosi
 */
public class Moto extends Vehiculo{
    int plazas;
    
    public Moto() {
        this.plazas = 2;
    }
    
    public Moto(int plazas) {
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    @Override
    public void imprimir_Basico() {
        System.out.println("TIPO: MOTO");
        System.out.println("PLAZAS: "+getPlazas());
    }
    @Override
    public void imprimir_extendido(int horas) {
        imprimir_Basico();
        int coste =15*horas;
        System.out.println("Precio: "+coste);
    }
    
    
    
    
    
}
