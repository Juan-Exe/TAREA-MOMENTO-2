/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;
import javafx.scene.control.TextField;

/**
 *
 * @author DAMIANA
 */
public class Pila {
    
    private Stack<Producto> productos;

    public Pila() {
        this.productos = new Stack<>();
    }

    public void setPush(Producto producto) {
        productos.push(producto);
    }

    public Producto setPop() {
        if (!productos.isEmpty()) {
            return productos.pop();
        } else {
            return null;
        }
    }
    public boolean existeProductoConID(int id) {
        for (Producto producto : productos) {
            if (producto.getIdProducto()== id) {
                return true;
            }
        }
        return false;
    }
    
     public boolean existeProductoConNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNomProducto() == null ? nombre == null : producto.getNomProducto().equals(nombre)) {
                return true;
            }
        }
        return false;
  }
     
public Producto getInfoProductoid (int id){
    for (Producto producto : productos) {
        
            if (producto.getIdProducto()== id) {
                
                return producto;
            }
        }
        return null;
    }


public Producto getInfoProductonom (String nombre){

    for (Producto producto : productos) {
        
            if (producto.getNomProducto() == null ? nombre == null : producto.getNomProducto().equals(nombre)) {
                
                return producto;
            }
        }
        return null;
    }

public Producto getInfoProductoFechaL (LocalDate FechaL){
    for (Producto producto : productos) {
        if (producto.getFechaLote().getValue().equals(FechaL)) {
            return producto;
        }
    }
    return null;
}



public Producto getInfoProductoFechaV (LocalDate FechaV){
    for (Producto producto : productos) {
        if (producto.getFechaVence().getValue().equals(FechaV)) {
            return producto;
        }
    }
    return null;
}

public Producto getInfoProductoPrecio (float Precio){
    for (Producto producto : productos) {
        
            if (producto.getPrecioU()==Precio) {
                
                return producto;
            }
        }
        return null;
    }

public float promPrecio(){
   float sumaPrecios = 0;

        for (Producto producto : productos) {
            sumaPrecios += producto.getPrecioU();
        }

        if (!productos.isEmpty()) {
            return sumaPrecios / productos.size();
        }

        return 0;
    }

public List<Producto> getProductosMayorPromedio() {
        float precioPromedio = promPrecio();
        List<Producto> productosMayorPromedio = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecioU()> precioPromedio) {
                productosMayorPromedio.add(producto);
            }
        }

        return productosMayorPromedio;
    }

public List<Producto> getProductosMenorPromedio() {
        float precioPromedio = promPrecio();
        List<Producto> productosMenorPromedio = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecioU()< precioPromedio) {
                productosMenorPromedio.add(producto);
            }
        }

        return productosMenorPromedio;
    }

    public Producto getProductoMayorPrecio() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto productoMayorPrecio = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getPrecioU()> productoMayorPrecio.getPrecioU()) {
                productoMayorPrecio = producto;
            }
        }

        return productoMayorPrecio;
    }

    public Producto getProductoMenorPrecio() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto productoMenorPrecio = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getPrecioU()< productoMenorPrecio.getPrecioU()) {
                productoMenorPrecio = producto;
            }
        }

        return productoMenorPrecio;
    }
    
   public List<Producto> getProductosPorMesLote(int mes) {
    List<Producto> productosMes = new ArrayList<>();
    for (Producto producto : productos) {
        if (producto.getFechaLote().getValue().getMonthValue() == mes) {
            productosMes.add(producto);
        }
    }
    return productosMes;
}

public List<Producto> getProductosPorMesVence(int mes) {
    List<Producto> productosMes = new ArrayList<>();
    for (Producto producto : productos) {
        if (producto.getFechaVence().getValue().getMonthValue() == mes) {
            productosMes.add(producto);
        }
    }
    return productosMes;
}
}
    




