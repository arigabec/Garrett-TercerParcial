package tercerParcial.E3;

import java.util.List;

public class SColegio implements ISistema {
    private String nombre;
    private int capacidad;
    private List<Estudiante> estudiantes;
    private String requisitos;

    private IRedSocial redSocial;

    public SColegio(String nombre, int capacidad, String requisitos, IRedSocial redSocial) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        this.redSocial = redSocial;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarDatos() {
        redSocial.mostrarDatos(this);
    }

    @Override
    public void showInfo(){
        System.out.println("<<< MOSTRANDO DATOS DEL COLEGIO >>>");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Estudiantes: ");
        for (Estudiante e:estudiantes) {
            System.out.println("  - " + e.getNombre());
        }
        System.out.println("Requisitos: " + requisitos);
    }
}
