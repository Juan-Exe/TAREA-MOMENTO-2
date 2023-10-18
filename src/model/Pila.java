/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
}