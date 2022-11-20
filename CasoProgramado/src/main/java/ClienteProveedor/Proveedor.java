package ClienteProveedor;

import javax.swing.JOptionPane;

public class Proveedor {

     //Atributos//
    private String nombre;
    private String telefono;
    private String direccion;
    private int id;

    //constructor//
    public Proveedor() {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;

    }

    public void mostrarDatos() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de proveedor");
        System.out.println("El nombre del proveedor es: " + nombre);
        String telefono = JOptionPane.showInputDialog("Ingrese el número de telefono");
        System.out.println("El número de telefono es: " + telefono);
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección");
        System.out.println("Su dirección es: " + direccion);
        String id = JOptionPane.showInputDialog("Ingrese su ID de proveedor");
        System.out.println("Su ID de proveedor es: " + id);

    }
       //metodos accesores//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void menu1() {

        //menu proveedor
        int opcion = 0;
        String op = "";
        op = JOptionPane.showInputDialog("Seleccione una opción; \n"
                + "1.- Vender productos\n"
                + "2.- Aplicar créditos\n"
                + "3.- Enviar factura\n");
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Su venta fue exitosa");
            case 2 ->
                JOptionPane.showMessageDialog(null, "Los créditos fueron realizados");
            case 3 ->
                JOptionPane.showMessageDialog(null, "La factura se genero correctamente");
        }
        System.exit(0);
    }

    public void setApellido(String acuña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getEmpleado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDireccion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
