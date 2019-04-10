package herencia2;

import javax.swing.JOptionPane;

public class Herencia2 {

    public static void main(String[] args) {
        
        Avion a= new Avion();
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad de avion: ", "capacidad", JOptionPane.QUESTION_MESSAGE));
        a.setCapacidad(capacidad);
        
        int numero_motores = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de motores: ", "numero_motores", JOptionPane.QUESTION_MESSAGE));
        a.setNumero_motores(numero_motores);
        
        String placa = JOptionPane.showInputDialog(null, "Placa de avion", "placa", JOptionPane.QUESTION_MESSAGE);
        a.setPlaca(placa);
        
        String marca = JOptionPane.showInputDialog(null, "Marca de avion", "marca", JOptionPane.QUESTION_MESSAGE);
        a.setMarca(marca);
        
        int costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Costo por compra del avion: ", "costo", JOptionPane.QUESTION_MESSAGE));
        a.setCosto(costo);
        
        JOptionPane.showMessageDialog(null,a.toString());
        
    }
    
}
