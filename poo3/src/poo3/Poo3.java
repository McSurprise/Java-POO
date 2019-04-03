package poo3;

public class Poo3 {

    public static void main(String[] args) {
       // Declarar los objetos del libro
       Libro libro1 = new Libro(101, "Trillce", "Cesar Vallejo", 102);
       Libro libro2 = new Libro(102, "La casa verde", "Mario Vargas Llosa", 200);
       //Escribir los libros
       System.out.println(libro1.toString());
       System.out.println(libro2.toString());
       //Modificar el numero de paginas
       libro1.setNroPagina(250);
       //Volver a escribir los libros
       System.out.println(libro1.toString());
       System.out.println(libro2.toString());
    }
}
