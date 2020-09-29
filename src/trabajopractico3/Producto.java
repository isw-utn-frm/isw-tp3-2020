
package trabajopractico3;
import java.util.*;
import java.util.regex.Pattern;

public class Producto {

    //ATRIBUTOS
        String ProductoId;
        String ProductoNom;
        double ProductoPrecio;
        String ProductoDescripcion;
        int ProductoStock;
        int ProductoModelo;
        Date ProductofchIngreso;

    public Producto( String ProductoNom, double ProductoPrecio, String ProductoDescripcion, int ProductoStock, int ProductoModelo, Date ProductofchIngreso) {
        this.ProductoNom = ProductoNom;
        this.ProductoPrecio = ProductoPrecio;
        this.ProductoDescripcion = ProductoDescripcion;
        this.ProductoStock = ProductoStock;
        this.ProductoModelo = ProductoModelo;
        this.ProductofchIngreso=ProductofchIngreso;
    }

    public String getProductoId() {
        return ProductoId;
    }

    public String getProductoNom() {
        return ProductoNom;
    }

    public double getProductoPrecio() {
        return ProductoPrecio;
    }

    public String getProductoDescripcion() {
        return ProductoDescripcion;
    }

    public int getProductoStock() {
        return ProductoStock;
    }

    public void setProductoModelo(int ProductoModelo) {
        this.ProductoModelo = ProductoModelo;
    }

    public void setProductofchIngreso(Date ProductofchIngreso) {
        this.ProductofchIngreso = ProductofchIngreso;
    }

    public void setProductoId(String ProductoId) {
        this.ProductoId = ProductoId;
    }

    public void setProductoNom(String ProductoNom) {
        this.ProductoNom = ProductoNom;
    }

    public void setProductoPrecio(double ProductoPrecio) {
        this.ProductoPrecio = ProductoPrecio;
    }

    public void setProductoDescripcion(String ProductoDescripcion) {
        this.ProductoDescripcion = ProductoDescripcion;
    }

    public void setProductoStock(int ProductoStock) {
        this.ProductoStock = ProductoStock;
    }
    
    
    static boolean fechaProductoEsMenorALaFechaActual(Producto p) {
    Date actual=new Date();
    
        return p.ProductofchIngreso.before(actual);
    }
    
    public static boolean validaDescripcionNoSeaVacio(Producto p){
        return !p.ProductoDescripcion.equals("");
    }
    
    public static boolean validaNombreNoSeaVacio(Producto p){
        //El nombre del producto, no puede ser vacio.
        return !p.ProductoNom.equals("");
    }
    
    public static boolean validaPrecioNoSeaMenorIgualACero(Producto p){
            //El nombre del producto, no puede ser vacio.
            return p.ProductoPrecio > 0;
        
    }
    
    public static boolean validaStockMayorIgualACero(Producto p){
        return p.getProductoStock()>0;
    }
    
    public static boolean validaModeloMayorIgualACero(Producto p){
        return p.ProductoModelo>0;
    }
}


    
