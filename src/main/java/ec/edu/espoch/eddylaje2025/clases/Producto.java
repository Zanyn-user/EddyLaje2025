
package ec.edu.espoch.eddylaje2025.clases;

import ec.edu.espoch.eddylaje2025.enumeraciones.Categoria;

/**
 *
 * @author User
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Producto(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
   public void mostrarDetalles(){
       double precioIVA= precio * 1.12;
       System.out.println("El nombre del producto es: "+ nombre);
       System.out.println("la categoria del producto es: "+categoria);
       System.out.println("Su precio sin IVA: "+precio);
       System.out.println("Precio con IVA: "+precioIVA);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
   
   
   
    
}
