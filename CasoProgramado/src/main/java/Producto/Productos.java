
package Producto;

import javax.swing.JOptionPane;


public class Productos {
    
     //Atributos//
    private String descripcion;
    private String garantia;
    private int precio;

    //constructor//
    public Productos() {
        this.descripcion = descripcion;
        this.garantia = garantia;
        this.precio = precio;

    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Tenemos en stock: etiquetas, folleteria, carteleria");
        String descripcion = JOptionPane.showInputDialog("Cual articulo desea seleccionar");
        System.out.println("El producto que selecciono es: " + descripcion);
        String garantia = JOptionPane.showInputDialog("Selecciones cuantos años de garantia le va a dar a el producto");
        System.out.println("Selecciono una garantia de: " + garantia);
        String precio = JOptionPane.showInputDialog("Digite el precio del producto");
        System.out.println("El precio de el producto es: " + precio);

        //metodos accesores//
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
