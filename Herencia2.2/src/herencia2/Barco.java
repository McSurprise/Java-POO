package herencia2;


public class Barco extends medioTransporte{
    int aforomax, peso;

    public Barco() {
    }
    
    public Barco(int aforomax, int peso) {
        this.aforomax = aforomax;
        this.peso = peso;
    }
    public int getAforomax() {
        return aforomax;
    }

    public void setAforomax(int aforomax) {
        this.aforomax = aforomax;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
     public String toString(){
         return "Aforo Maximo: " + this.getAforomax() + " Personas "
                 + "\n Peso: " + getPeso() + " Kilogramos "
                 + "\n Placa: " + getPlaca() 
                 + "\n Marca: " + getMarca()
                 + "\n Costo: " + getCosto();
     }
}
