/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

/**
 *
 * @author LAB
 */
public class Artefacto {
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    
    public Artefacto(String codigo, String nombre, String marca, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
     public String toString(){
         return "El artefacto " + nombre + " de marca " + marca + " con codigo "
                  + codigo + " tiene un precio de " + precio + " soles " ;
     }
     public double IGV(){
         return precio * 0.18;
     }
}
