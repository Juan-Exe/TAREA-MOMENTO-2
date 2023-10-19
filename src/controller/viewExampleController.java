/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;


import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
    
    
    //Button promedio
    
    @FXML
    Button pbutton;
    
    @FXML
    Button mbutton;
    
    @FXML
    Button mebutton;
    
    @FXML
    Button pMbutton;
    
    @FXML
    Button pmbutton;
    
    @FXML
    private void promedio(ActionEvent event){
        float precioPromedio = model.promPrecio();
        JOptionPane.showMessageDialog(null, "Precio promedio de productos: " + precioPromedio);
    }
    
    @FXML
    private void mayorpromedio(ActionEvent event){
        List<Producto> productosMayorPromedio = model.getProductosMayorPromedio();

    StringBuilder detalles = new StringBuilder("Productos con precio mayor al promedio:\n");

    for (Producto producto : productosMayorPromedio) {
        detalles.append("ID: ").append(producto.getIdProducto())
                .append(" - Nombre: ").append(producto.getNomProducto())
                .append(" - Precio: ").append(producto.getPrecioU())
                .append("\n");
    }

    JOptionPane.showMessageDialog(null, detalles.toString(), "Productos Mayor al Promedio", JOptionPane.INFORMATION_MESSAGE);
}

    @FXML
    private void menopromedio(ActionEvent event){
            List<Producto> productosMenorPromedio = model.getProductosMenorPromedio();

    StringBuilder detalles = new StringBuilder("Productos con precio menor al promedio:\n");

    for (Producto producto : productosMenorPromedio) {
        detalles.append("ID: ").append(producto.getIdProducto())
                .append(" - Nombre: ").append(producto.getNomProducto())
                .append(" - Precio: ").append(producto.getPrecioU())
                .append("\n");
    }

    JOptionPane.showMessageDialog(null, detalles.toString(), "Productos Menor al Promedio", JOptionPane.INFORMATION_MESSAGE);
}
    @FXML
    private void menorprecio(ActionEvent event){
        Producto productoMenorPrecio = model.getProductoMenorPrecio();

    if (productoMenorPrecio != null) {
        String detalles = "ID: " + productoMenorPrecio.getIdProducto()+
                          "\nNombre: " + productoMenorPrecio.getNomProducto()+
                          "\nPrecio: " + productoMenorPrecio.getPrecioU();
        JOptionPane.showMessageDialog(null, detalles, "Producto con Precio Menor", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No hay productos en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    @FXML
    private void mayorpecio(ActionEvent event){
        Producto productoMayorPrecio = model.getProductoMayorPrecio();

    if (productoMayorPrecio != null) {
        String detalles = "ID: " + productoMayorPrecio.getIdProducto()+
                          "\nNombre: " + productoMayorPrecio.getNomProducto()+
                          "\nPrecio: " + productoMayorPrecio.getPrecioU();
        JOptionPane.showMessageDialog(null, detalles, "Producto con Precio Mayor", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No hay productos en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    
    //FINAL PROMEDIO
    
    //MENU
    
    @FXML
    private MenuBar menu;
    
    @FXML
    private Menu buscar;
    
    @FXML
    private MenuItem mid;
    
    @FXML
    private MenuItem nom;
    
    @FXML
    private MenuItem fech;
    
    @FXML
    private MenuItem fechv;
    
       @FXML
    private MenuItem pre;

    
    
    
    @FXML
    private void Action(ActionEvent event){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id que desea buscar"));
        Producto producto = model.getInfoProductoid(id);
        
        if (producto != null) {
                // Mostrar los detalles del producto
                String detalles = "ID: " + producto.getIdProducto()+
                                  "\nNombre: " + producto.getNomProducto()+
                                  "\nFecha Lote: " + producto.getFechaLote() +
                                  "\nFecha Vencimiento: " + producto.getFechaVence() +
                                  "\nPrecio: " + producto.getPrecioU();
                JOptionPane.showMessageDialog(null, detalles, "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje indicando que el producto no se encontró
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el ID " + id, "Producto No Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    

    
    @FXML
    private void Action2(ActionEvent event){
        
        String nombre = JOptionPane.showInputDialog("Ingrese el Nombre que desea buscar");
        Producto producto = model.getInfoProductonom(nombre);
        
         if (producto != null) {
                // Mostrar los detalles del producto
                String detalles = "ID: " + producto.getIdProducto()+
                                  "\nNombre: " + producto.getNomProducto()+
                                  "\nFecha Lote: " + producto.getFechaLote() +
                                  "\nFecha Vencimiento: " + producto.getFechaVence() +
                                  "\nPrecio: " + producto.getPrecioU();
                JOptionPane.showMessageDialog(null, detalles, "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje indicando que el producto no se encontró
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el ID " + nombre, "Producto No Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    @FXML
    private void Action3(ActionEvent event){
        
        String FechaL = JOptionPane.showInputDialog("Ingrese la Fecha Lote que desea buscar");
        Producto producto = model.getInfoProductoFechaL(FechaL);
        
        if (producto != null) {
                // Mostrar los detalles del producto
                String detalles = "ID: " + producto.getIdProducto()+
                                  "\nNombre: " + producto.getNomProducto()+
                                  "\nFecha Lote: " + producto.getFechaLote() +
                                  "\nFecha Vencimiento: " + producto.getFechaVence() +
                                  "\nPrecio: " + producto.getPrecioU();
                JOptionPane.showMessageDialog(null, detalles, "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje indicando que el producto no se encontró
                JOptionPane.showMessageDialog(null, "No se encontró un producto con la Fecha Lote " + FechaL, "Producto No Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    
     @FXML
    private void Action4(ActionEvent event){
        
         String FechaV = JOptionPane.showInputDialog("Ingrese la Fecha Vencimiento que desea buscar");
        Producto producto = model.getInfoProductoFechaL(FechaV);
        
         if (producto != null) {
                // Mostrar los detalles del producto
                String detalles = "ID: " + producto.getIdProducto()+
                                  "\nNombre: " + producto.getNomProducto()+
                                  "\nFecha Lote: " + producto.getFechaLote() +
                                  "\nFecha Vencimiento: " + producto.getFechaVence() +
                                  "\nPrecio: " + producto.getPrecioU();
                JOptionPane.showMessageDialog(null, detalles, "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje indicando que el producto no se encontró
                JOptionPane.showMessageDialog(null, "No se encontró un producto con la Fecha Vencimiento: " + FechaV, "Producto No Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    
        @FXML
    private void Action5(ActionEvent event){
        
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Precio que desea buscar"));
        Producto producto = model.getInfoProductoPrecio(precio);
        
         if (producto != null) {
                // Mostrar los detalles del producto
                String detalles = "ID: " + producto.getIdProducto()+
                                  "\nNombre: " + producto.getNomProducto()+
                                  "\nFecha Lote: " + producto.getFechaLote() +
                                  "\nFecha Vencimiento: " + producto.getFechaVence() +
                                  "\nPrecio: " + producto.getPrecioU();
                JOptionPane.showMessageDialog(null, detalles, "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar un mensaje indicando que el producto no se encontró
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el Precio: " + precio, "Producto No Encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    
    
    
    //FIN MENU
   
    
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
                    " ID  producto ya esta registrado"
                + "\n Ya existe un producto con el ID: " + id );
            
        }else 
            
            if (model.existeProductoConNombre(nombre)){
            JOptionPane.showMessageDialog(null,
                    " Nombre del producto ya esta registrado"
                + "\n Ya existe un producto con el ID: " + nombre );
        }else{
            
            Producto producto = new Producto(id, nombre, fechaLot, fechaVen, precio);
            model.setPush(producto);
            Productos.add(producto);
            
            idProductoTextField.clear();
            nomProductoTextField.clear();
            PrecioUTextField.clear();
            FechaLoteTextField.clear();
            FechaVenceTextField.clear();
            
            JOptionPane.showMessageDialog(null, "Se ha  agegado elementos a la Pila");
            
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
