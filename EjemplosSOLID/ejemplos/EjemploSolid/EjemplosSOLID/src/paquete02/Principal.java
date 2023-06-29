package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Loja ");
        Ciudad c2 = new Ciudad("Azogues");

        Persona p1 = new Persona("Sebastián", 19, c1);
        Persona p2 = new Persona("Romina", 18, c2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        ArrayList<Persona> listaP = new ArrayList<>();
        listaP.add(p1);
        listaP.add(p2);

        op1.establecerEstudiante(listaP);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudades();

        System.out.printf("Promedio edades: %.2f\n"
                + "Promedio Edad Mínima: %d\n"
                + "Promedio Edad Máxima: %d\n"
                + "Ciudades: %s \n",
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudades());
    }
}
