/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;


import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;
import model.Pila;
import model.Producto;

/**
 *
 * @author DAMIANA
 */
public class viewExampleController implements Initializable {
    
    private Pila model = new Pila();
    
    //TABLA---------------------------------------------------------------------
    
    @FXML
    private TableView<Producto> Table;
     
    @FXML
    private TableColumn<Producto, Integer> idProducto;
    
    @FXML
    private TableColumn<Producto, String> nomProducto;
    
    @FXML
    private TableColumn<Producto, String> fechaLote;
    
     @FXML
    private TableColumn<Producto, String> fechaVence;
    
    @FXML
    private TableColumn<Producto, Float> PrecioU;
     
    private ObservableList<Producto> Productos  = FXCollections.observableArrayList();
    
    //FIN DE TABLA--------------------------------------------------------------
    
    @FXML
    private Button button;
        
    //TEXT FIELD----------------------------------------------------------------
    
    @FXML
    private TextField idProductoTextField, nomProductoTextField,FechaLoteTextField,FechaVenceTextField,PrecioUTextField;
    
    @FXML
    private void eventKey(KeyEvent event){
        
        Object evt = event.getSource();
        
     
        
        if(evt.equals(idProductoTextField)){
        
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }
           
         }else if (evt.equals(nomProductoTextField)){
            
            if(!Character.isLetter(event.getCharacter().charAt(0))){
                event.consume();
            }
            
        }else if (evt.equals(FechaLoteTextField)){
            
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }
           }else if (evt.equals(FechaVenceTextField)){
            
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            
            }
        }else if (evt.equals(PrecioUTextField)){ 
            
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }
            
        }    
            
    }
    //FIN DE TEXT FIELD---------------------------------------------------------
    
    //REGISTRAR EN LA TABLA
    
    @FXML
    private void eventButton(ActionEvent event){
        int id = Integer.parseInt(idProductoTextField.getText());
        String nombre = nomProductoTextField.getText();
        float precio = Float.parseFloat(PrecioUTextField.getText());
        String fechaLot = FechaLoteTextField.getText();
        String fechaVen = FechaVenceTextField.getText();
        
        if (model.existeProductoConID(id)){
            JOptionPane.showMessageDialog(null,
                    " ID producto ya esta registrado"
                + "\n Ya existe un producto con el ID: " + id );
        }else{
            Producto producto = new Producto(id, nombre, fechaLot, fechaVen, precio);
            model.setPush(producto);
            Productos.add(producto);
            
            idProductoTextField.clear();
            nomProductoTextField.clear();
            PrecioUTextField.clear();
            FechaLoteTextField.clear();
            FechaVenceTextField.clear();
            
            JOptionPane.showMessageDialog(null, "Se ha  agegado elementos a la lista");
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idProducto.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("idProducto"));
        nomProducto.setCellValueFactory(new PropertyValueFactory<Producto, String>("nomProducto"));
        PrecioU.setCellValueFactory(new PropertyValueFactory<Producto, Float>("PrecioU"));
        fechaLote.setCellValueFactory(new PropertyValueFactory<Producto, String>("fechaLote"));
        fechaVence.setCellValueFactory(new PropertyValueFactory<Producto, String>("fechaVence"));
        
        // Inicializa la tabla con los datos de la
        Table.setItems(Productos);
       
        

        
    }
        
       
}
