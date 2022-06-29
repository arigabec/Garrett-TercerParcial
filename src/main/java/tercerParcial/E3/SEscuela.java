package tercerParcial.E3;

import java.util.ArrayList;
import java.util.List;

public class SEscuela implements ISistema {
    private String nombre;
    private int capacidad;
    private List<Estudiante> estudiantes;
    private String requisitos;

    private IRedSocial redSocial;

    public SEscuela(String nombre, int capacidad, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        estudiantes = new ArrayList<>();
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("<<< MOSTRANDO DATOS DE LA ESCUELA >>>");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Estudiantes: ");
        for (Estudiante e:estudiantes) {
            System.out.println("  - " + e.getNombre());
        }
        System.out.println("Requisitos: " + requisitos);
        System.out.println();
    }
}
