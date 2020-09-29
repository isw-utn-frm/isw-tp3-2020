/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class CarroDeCompras {
    //ATRIBUTOS
    private ArrayList<DetalleCarro> detalles = new ArrayList<DetalleCarro>();
    double Total;

    public CarroDeCompras(double Total, DetalleCarro det) {
        this.Total    = Total;
        this.detalles.add(det);
    }


    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
    
    
    //Metodos
    
    public static boolean stockNoSeaMenorIgualCero(Producto p){
        return p.ProductoStock > 0;
    }
    
    
    public static boolean cantidadNoSeaMenorIgualCero(CarroDeCompras cd){
        int cant = cd.detalles.get(0).getCantidad();
        if (cant<=0) {
            return false;
        } else {
            return true;
        }
    }
    
}
