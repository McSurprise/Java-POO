package herencia;


public class Docente extends Persona{
    
    private String profesion;
    private double sueldo;
    private String condicion;
    private String AFP;

    public Docente() {
    }

    public Docente(String profesion, double sueldo, String condicion, String AFP) {
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.condicion = condicion;
        this.AFP = AFP;
    }
    
    
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    //Implementar el metodo ToString
    @Override
    public String toString(){
        return this.getDNI() + this.getNombres() + "\n" + this.getApellidos() + 
             "\n" +    this.getGenero() + "\n" +  this.getLugarNacimiento() + 
             "\n" +    this.getSueldo() + "\n" + this.getCondicion() + 
             "\n" +    this.getAFP();
    }
    
    
}
