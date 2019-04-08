package herencia;
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declarar un objeto persona
       Persona persona = new Persona();
        persona.setDNI("12345678");
        persona.setNombres("David");
        persona.setApellidos("Quispe");
        persona.setGenero("Masculino");
        persona.setLugarNacimiento("Cusco");
        
        //Escribir los datos de las Persona
        Docente docente = new Docente();
        docente.setDNI("123456897989");
        docente.setNombres("Juan");
        docente.setApellidos("Perez");
        docente.setGenero("Masculino");
        docente.setLugarNacimiento("Cusco");
        docente.setProfesion("Ingeniero");
        docente.setSueldo(2000);
        docente.setCondicion("Nombrado");
        docente.setAFP("Integral");
        
        //Datos del estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setDNI("123456");
        estudiante.setNombres("Juan");
        estudiante.setApellidos("Perez");
        estudiante.setGenero("Masculino");
        estudiante.setLugarNacimiento("Cusco");
        estudiante.setCarrera("Ingenieria");
        estudiante.setCiclo(3);
        estudiante.setCreditos(32);
        
        //Escribir los datos del docente
        System.out.println(estudiante.toString());
    }
    
    
}
