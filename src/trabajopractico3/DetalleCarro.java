/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

/**
 *
 * @author Charly
 */
public class DetalleCarro {
          //ATRIBUTOS
    private Producto producto;
    private int cantidad;
    
    
    
          //MÉTODOS GET Y SET 
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        //MÉTODOS DE VALIDACIÓN 
    public static boolean validaCantidad(DetalleCarro detalle) {
        if (detalle.cantidad > 0) {
                   return true;
           }else
                   return false;
    }


    //CONSTRUCTOR
    public DetalleCarro(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }



}
    
    

