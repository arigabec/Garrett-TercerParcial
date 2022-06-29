package tercerParcial.E3;

public class Client {
    public static void main(String[] args){

        SColegio colegio = new SColegio("San Calixto", 50, "Carnet de identidad");
        colegio.addEstudiante(new Estudiante("Luis Gutierrez", 15));
        colegio.addEstudiante(new Estudiante("Ana Lopez", 17));

        SEscuela escuela = new SEscuela("Barrientos", 40, "Certificado de nacimiento");
        escuela.addEstudiante(new Estudiante("Brandon Quintanilla", 10));

        SUniversidad universidad = new SUniversidad("UPB", 60, "Titulo de bachiller");
        universidad.addEstudiante(new Estudiante("Camilo Ruiz", 21));

        Facebook facebook = new Facebook(colegio);
        facebook.mostrarDatos();

        Whatsapp whatsapp = new Whatsapp(escuela);
        whatsapp.mostrarDatos();

        Twitter twitter = new Twitter(universidad);
        twitter.mostrarDatos();
    }
}
