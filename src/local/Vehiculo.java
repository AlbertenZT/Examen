
package local;

/**
 *
 * @author Alberto Zaragosi
 */
public class Vehiculo {

    //por defecto los vehículos son uniplaza excepto que sean coches o motos
    private int plazas;

    Vehiculo() {
        plazas = 1;
    }

    public int getPlazas() {
        return plazas;
    }
    
    public void imprimir_Basico() {
        System.out.println("TIPO: Vehiculo");
        System.out.println("PLAZAS: "+getPlazas());
    }

    public void imprimir_extendido(int horas) {
        imprimir_Basico();
        int coste =10*horas;
        System.out.println("Precio: "+coste);
    }
    
    
}


