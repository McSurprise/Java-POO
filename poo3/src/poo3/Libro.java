/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author LAB
 */
public class Libro {
    private int ISBN;

    public Libro(int ISBN, String titulo, String autor, int nroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPagina = nroPagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPagina() {
        return nroPagina;
    }

    public void setNroPagina(int nroPagina) {
        this.nroPagina = nroPagina;
    }
       private String titulo;
       private String autor;
       private int nroPagina;
       
     //Metodo sobrecargado de base padre
     @Override
     public String toString(){
         return "El iibro " + titulo + " con ISSN " + ISBN + " creado por el autor "
                  + autor + " tiene " + nroPagina + " paginas " ;
     }
    
}
