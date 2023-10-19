/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DAMIANA
 */
public class Producto {
 
    int idProducto;
    String nomProducto;
    String FechaLote;
    String FechaVence;
    float PrecioU;

    public Producto() {
        idProducto=-1;
        nomProducto=FechaLote=FechaVence="";
        PrecioU=-1;
    }
    
    

    public Producto(int idProducto, String nomProducto, String FechaLote, String FechaVence, float PrecioU) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.FechaLote = FechaLote;
        this.FechaVence = FechaVence;
        this.PrecioU = PrecioU;
    }


   

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getFechaLote() {
        return FechaLote;
    }

    public void setFechaLote(String FechaLote) {
        this.FechaLote = FechaLote;
    }

    public String getFechaVence() {
        return FechaVence;
    }

    public void setFechaVence(String FechaVence) {
        this.FechaVence = FechaVence;
    }

    public float getPrecioU() {
        return PrecioU;
    }

    public void setPrecioU(float PrecioU) {
        this.PrecioU = PrecioU;
    }
    
    
    
}



    