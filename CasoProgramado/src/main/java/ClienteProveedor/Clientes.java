
package ClienteProveedor;

import javax.swing.JOptionPane;

public class Clientes {
    
     //Atributos//
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private int cedula;
    private int telefono;

    //Constructor//
    public Clientes() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public void mostrarDatos() {
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        System.out.println("El nombre del Cliente es: " + nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        System.out.println("Su Apellido es: " + apellido);
        String edad = JOptionPane.showInputDialog("Ingrese su Edad");
        System.out.println("Su Edad es: " + edad);
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico");
        System.out.println("Su correo electrónico es: " + correo);
        String cedula = JOptionPane.showInputDialog("Ingrese su número de cédula");
        System.out.println("Su número de cédula es: " + cedula);
        String telefono = JOptionPane.showInputDialog("Ingrese su número de teléfono");
        System.out.println("Su número de teléfono es: " + telefono);

    }

    //metodos accesores//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void Login2() {
        //login cliente//
        int intentos = 0;
        while (intentos < 3) {

            String U = "cliente";
            String P = "789";

            JOptionPane.showMessageDialog(null, "Bienvenido al sistema \n"
                    + "Vamos a verificar sus datos");
            String User = JOptionPane.showInputDialog("Ingrese su Usuario:");
            String Pass = JOptionPane.showInputDialog("Ingrese su contraseña:");

            if (U.equals(User)) {
                if (P.equals(Pass)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!!");
                    intentos = 3;
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    intentos += 1;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                intentos += 1;
            }

        }
    }
       
        public void menu2() {

        //menu cliente
        int opcion = 0;
        String op = "";
        op = JOptionPane.showInputDialog("Seleccione una opción; \n"
                + "1.- Comprar articulo\n"
                + "2.- Solicitar factura\n"
                + "3.- Cordinar entrega\n");
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Su compra fue exitosa");
            case 2 ->
                JOptionPane.showMessageDialog(null, "Su factura fue enviada");
            case 3 ->
                JOptionPane.showMessageDialog(null, "La entrega se cordino correctamente");
        }
        System.exit(0);
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
