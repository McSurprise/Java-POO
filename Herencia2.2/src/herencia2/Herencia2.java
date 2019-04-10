package herencia2;

import javax.swing.JOptionPane;

public class Herencia2 {

    public static void main(String[] args) {
        
        Avion a= new Avion();
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de asientos en el avion : ", "capacidad", JOptionPane.QUESTION_MESSAGE));
        a.setCapacidad(capacidad);
        
        int numero_motores = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de motores: ", "numero_motores", JOptionPane.QUESTION_MESSAGE));
        a.setNumero_motores(numero_motores);
        
        String placa = JOptionPane.showInputDialog(null, "Placa de avion", "placa", JOptionPane.QUESTION_MESSAGE);
        a.setPlaca(placa);
        
        String marca = JOptionPane.showInputDialog(null, "Marca de avion", "marca", JOptionPane.QUESTION_MESSAGE);
        a.setMarca(marca);
        
        int costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Costo del avion: ", "costo", JOptionPane.QUESTION_MESSAGE));
        a.setCosto(costo);
        
        JOptionPane.showMessageDialog(null,a.toString());
        
        ////////////////////////////////////////////////////////////////////////////////////////////
        
        Barco b= new Barco();
        int aforomax = Integer.parseInt(JOptionPane.showInputDialog(null, "Aforo maximo del barco: ", "aforomax", JOptionPane.QUESTION_MESSAGE));
        b.setAforomax(aforomax);
        
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Peso en Kg: : ", "peso", JOptionPane.QUESTION_MESSAGE));
        b.setPeso(peso);
        
        placa = JOptionPane.showInputDialog(null, "Placa de Barco", "placa", JOptionPane.QUESTION_MESSAGE);
        b.setPlaca(placa);
        
        marca = JOptionPane.showInputDialog(null, "Marca de Barco", "marca", JOptionPane.QUESTION_MESSAGE);
        b.setMarca(marca);
        
        costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Costo del Barco: ", "costo", JOptionPane.QUESTION_MESSAGE));
        b.setCosto(costo);
        
        JOptionPane.showMessageDialog(null,b.toString());
        
        //////////////////////////////////////////////////////////////////////////////////
        
        Automovil am= new Automovil();
        String color = JOptionPane.showInputDialog(null, "Color del automovil: ", "color", JOptionPane.QUESTION_MESSAGE);
        am.setColor(color);
        
        int velocidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidad del automovil(Km/h): : ", "velocidad", JOptionPane.QUESTION_MESSAGE));
        am.setVelocidad(velocidad);
        
        placa = JOptionPane.showInputDialog(null, "Placa de Automovil", "placa", JOptionPane.QUESTION_MESSAGE);
        am.setPlaca(placa);
        
        marca = JOptionPane.showInputDialog(null, "Marca de Automovil", "marca", JOptionPane.QUESTION_MESSAGE);
        am.setMarca(marca);
        
        costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Costo del Automovil: ", "costo", JOptionPane.QUESTION_MESSAGE));
        am.setCosto(costo);
         
        JOptionPane.showMessageDialog(null,am.toString());
       
    }
    
}
