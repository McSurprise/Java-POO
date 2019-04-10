package herencia2;


public class Avion extends medioTransporte{
    private int capacidad;
    private int numero_motores;

    public Avion(int capacidad, int numero_motores) {
        this.capacidad = capacidad;
        this.numero_motores = numero_motores;
    }

    public Avion() {
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
     
    @Override
     public String toString(){
         return "Capacidad de avion: " + this.getCapacidad() 
                 + "\n Numero de motores: " + getNumero_motores() + " motores "
                 + "\n Placa: " + getPlaca() 
                 + "\n Marca: " + getMarca()
                 + "\n Costo: " + getCosto();
     }
}
