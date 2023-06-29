/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerListaCiudades() {
        String mensaje = "";
        for (Persona e : obtenerEstudiante()) {
            mensaje = mensaje + e.obtenerCiudad().obtenerNombre();
        }
        listaCiudadesEstudiantes = mensaje;
    }

    public void establecerEdadMinima() {
        edadminima = estudiantes.get(0).obtenerEdad();
        for (Persona e : estudiantes) {
            int edadActual = e.obtenerEdad();
            if (edadActual < edadminima) {
                edadminima = edadActual;
            }
        }
    }

    public void establecerEdadMaxima() {
        edadmaxima = estudiantes.get(0).obtenerEdad();
        for (Persona e : estudiantes) {
            int edadActual = e.obtenerEdad();
            if (edadActual > edadmaxima) {
                edadmaxima = edadActual;
            }
        }
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        return edadmaxima;
    }

    public String obtenerListaCiudades() {
        return listaCiudadesEstudiantes;
    }

}
