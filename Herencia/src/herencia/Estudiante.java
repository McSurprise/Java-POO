
package herencia;

public class Estudiante extends Persona {
    private String carrera;
    private int ciclo;
    private int creditos;

    
    public Estudiante() {
    }
    
    public Estudiante(String carrera, int ciclo, int creditos) {
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.creditos = creditos;
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }  
    
    //Implementar el metodo ToString
    @Override
    public String toString(){
        return this.getDNI() + "\n" + this.getNombres() + "\n" + this.getApellidos() + 
             "\n" +    this.getGenero() + "\n" +  this.getLugarNacimiento() + 
             "\n" +    this.getCarrera() + "\n" + this.getCiclo() + 
             "\n" +    this.getCreditos();
    }
   
}
