package poo4;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB
 */
public class Poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar los objetos del libro
        
        String codigo = JOptionPane.showInputDialog(null, "Introduzca el codigo del 1° artefacto ", "nombre", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre del 1° artefacto", "nombre", JOptionPane.QUESTION_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Introduzca el marca del 1° artefacto", "nombre", JOptionPane.QUESTION_MESSAGE);
        double precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el precio del 1° artefacto", "precio", JOptionPane.QUESTION_MESSAGE));
        
        Artefacto a1= new Artefacto(codigo, nombre, marca, precio);
        
        String codigo1 = JOptionPane.showInputDialog(null, "Introduzca el codigo del 2° artefacto", "nombre", JOptionPane.QUESTION_MESSAGE);
        String nombre1 = JOptionPane.showInputDialog(null, "Introduzca el nombre del 2° artefacto", "nombre", JOptionPane.QUESTION_MESSAGE);
        String marca1 = JOptionPane.showInputDialog(null, "Introduzca el marca del 2° artefacto", "nombre", JOptionPane.QUESTION_MESSAGE);
        double precio1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el precio del 2° artefacto", "precio", JOptionPane.QUESTION_MESSAGE));
        
        Artefacto a2= new Artefacto(codigo1, nombre1, marca1, precio1);
        
        JOptionPane.showMessageDialog(null,a1.toString());
        JOptionPane.showMessageDialog(null,a2.toString());
        
        if(a1.IGV()>a2.IGV())
           JOptionPane.showInputDialog(null, "El artefacto " + a1.getNombre() + " tiene el mayor pago en IGV con " + a1.IGV());
       else 
           JOptionPane.showInputDialog(null, "El artefacto " + a2.getNombre() + " tiene el mayor pago en IGV con " + a2.IGV());
        
        /* 
       Artefacto a1 = new Artefacto("01", "Mouse", "HP", 20);
       Artefacto a2 = new Artefacto("02", "Teclado", "HP", 80);
       //Escribir los libros
       System.out.println(a1.toString());
       System.out.println(a2.toString());
       
       if(a1.IGV()>a2.IGV())
           System.out.println("El artefacto" + a1.getNombre() + " tiene el mayor pago en IGV con " + a1.IGV());
       else 
           System.out.println("El artefacto " + a2.getNombre() + " tiene el mayor pago en IGV con " + a2.IGV());
        */
    } 
}
