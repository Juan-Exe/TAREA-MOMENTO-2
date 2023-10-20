/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author DAMIANA
 */
public class Producto {
 
    int idProducto;
    String nomProducto;
    private ObjectProperty<LocalDate> FechaLote;
    private ObjectProperty<LocalDate> FechaVence;


    float PrecioU;

    public Producto() {
        idProducto=-1;
        nomProducto="";
        PrecioU=-1;
        FechaLote=FechaVence=new SimpleObjectProperty<>(LocalDate.now());
    }
    
    

    public Producto(int idProducto, String nomProducto,LocalDate  FechaLote,LocalDate FechaVence, float PrecioU) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.FechaLote = new SimpleObjectProperty<>(FechaLote);
        this.FechaVence = new SimpleObjectProperty<>(FechaVence);
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

    public ObjectProperty<LocalDate> getFechaLote() {
        return FechaLote;
    }

    public void setFechaLote(ObjectProperty<LocalDate> FechaLote) {
        this.FechaLote = FechaLote;
    }

    public ObjectProperty<LocalDate> getFechaVence() {
        return FechaVence;
    }

    public void setFechaVence(ObjectProperty<LocalDate> FechaVence) {
        this.FechaVence = FechaVence;
    }

    public float getPrecioU() {
        return PrecioU;
    }

    public void setPrecioU(float PrecioU) {
        this.PrecioU = PrecioU;
    }

    
}



    