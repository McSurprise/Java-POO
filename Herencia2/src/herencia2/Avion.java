
package herencia2;


public class Avion {
    int capacidad, numero_motores;

    public Avion() {
    }

    public Avion(int capacidad, int numero_motores) {
        this.capacidad = capacidad;
        this.numero_motores = numero_motores;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero_motores() {
        return numero_motores;
    }

    public void setNumero_motores(int numero_motores) {
        this.numero_motores = numero_motores;
    }
     
}
