package TrabajoPractico4;

import Clases.Guerrero;
import Clases.Position;

public class TestHerencia {

    public static void main(String[] args) {
        ///a. Crear un Guerrero de nombre “Thor” en la posición X=100, Y=200
        Guerrero guerrero=new Guerrero(true,new Position(100,200),"Thor");
        
        ///Cual es el estado de energía al inicializar la ejecución?
        System.out.println("Energia actual: "+guerrero.getEnergia());
        System.out.println("Posicion actual: X:"+guerrero.getUbicacion().getX()+" Y:"+guerrero.getUbicacion().getY());
        System.out.println("Orientacion actual: "+orientacion(guerrero.getOrientacion())+"\n");
        
        ///b. Hacerlo girar hasta que mire al Oeste
        while(guerrero.getOrientacion()!='O'){
            guerrero.Girar();
            System.out.println("Giro hacia: "+orientacion(guerrero.getOrientacion()));
        }
        System.out.println("");
        
        ///c. Hacerlo Avanzar 5 pasos
        for (int i = 0; i < 5; i++) {
            guerrero.Avanzar();
        }
        
        ///d. Hacerlo disparar 8 veces
        for (int i = 0; i < 8; i++) {
            guerrero.Disparar();
        }
        
        ///cual es estado de energía después de ejecutarse el d.?
        System.out.println("\nEnergia actual: "+guerrero.getEnergia());
        System.out.println(guerrero.getUbicacion());
        System.out.println("Orientacion actual: "+orientacion(guerrero.getOrientacion()));
    }
    
    public static String orientacion(char orientacion){
        String x;
        switch(orientacion){
            case 'N':
                x="NORTE";
                break;
            case 'E':
                x="ESTE";
                break;
            case 'S':
                x="SUR";
                break;
            default:
                x="OESTE";
        }
        return x;
    }
}