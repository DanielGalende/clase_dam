public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;

    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " a√±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int  name = nombre.length();
        int  newnumeroMatricula = numeroMatricula.length(); 
        String nombreUsuarioGithub = null;
        if (name < 3 && newnumeroMatricula < 4) {
            nombreUsuarioGithub = nombre.substring(0,name) + numeroMatricula.substring(0,newnumeroMatricula);
            return null;
        }
        else if (newnumeroMatricula < 4) {
            System.out.println("El par·metro de matricula es menor a 4 caracteres, tiene que ser igual o mayor a este.");
        }
        else if (name < 3) {
            System.out.println("El par·metro del nombre es menor a 3 caracteres, tiene que ser igual o mayor a este.");
        }
        else {
            
        }
        return nombreUsuarioGithub = nombre.substring(0, 3) + numeroMatricula.substring(0,4);
    }
}
    
    
    