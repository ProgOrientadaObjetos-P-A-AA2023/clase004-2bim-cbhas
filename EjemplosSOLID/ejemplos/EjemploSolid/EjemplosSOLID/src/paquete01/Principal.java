package paquete01;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Sebastián", 18);
        Persona p2 = new Persona("Romina", 18);
        
        System.out.printf("%s\n", p1.obtenerEdad());
        System.out.printf("%s\n", p2.obtenerEdad());
        
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        
        double promedio = p1.promedioEdades(lista);
        
        System.out.printf("%.2f\n", promedio);
    }

}
