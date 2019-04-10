package herencia2;

public class Automovil extends medioTransporte{
    String color;
    float velocidad;

    public Automovil() {
    }

    public Automovil(String color, float velocidad) {
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
     public String toString(){
         return "Color: " + this.getColor() 
                 + "\n Velocidad: " + getVelocidad() + " motores "
                 + "\n Placa: " + getPlaca() 
                 + "\n Marca: " + getMarca()
                 + "\n Costo: " + getCosto();
     }
}
