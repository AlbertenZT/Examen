
package local;

import java.util.Scanner;

/**
 *
 * @author Alberto Zaragosi
 */
public class EmpresaAlquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        
        
               
       Coche coche=new Coche();
       Moto moto=new Moto();
       Vehiculo vehiculo=new Vehiculo();
       
              
        System.out.println("introduce el número de horas del coche");
        int horasC =SC.nextInt();
        System.out.println("introduce el número de horas del Moto");
        int horasM =SC.nextInt();
        System.out.println("introduce el número de horas del Vehiculo Personal");
        int horasV =SC.nextInt();
   
        coche.imprimir_extendido(horasC);
        
        System.out.println("-----------------");
        moto.imprimir_extendido(horasM);
        
        System.out.println("-----------------");
        vehiculo.imprimir_extendido(horasV);
        
        
        
    }
    
}
