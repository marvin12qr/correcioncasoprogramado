
package AdministradorColaborador;

import javax.swing.JOptionPane;

public class Colaborador {
    
    
    //Atributos//
    private String nombre;
    private String apellido;
    private int edad;
    private int empleado;

    //Constructor//
    public Colaborador() {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.empleado = empleado;

    }

    public void mostrarDatos() {
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        System.out.println("El nombre del Colaborador es: " + nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        System.out.println("Su Apellido es: " + apellido);
        String edad = JOptionPane.showInputDialog("Ingrese su Edad");
        System.out.println("Su Edad es: " + edad);
        String id = JOptionPane.showInputDialog("Ingrese su número de empleado");
        System.out.println("Su número de empleado es: " + id);
    }

    //Metodos accesores//
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

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public void Login1() {
        //login administrador
        int intentos = 0;
        while (intentos < 3) {

            String U = "colab";
            String P = "456";

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

    public void menu1() {

        //menu colaborador
        int opcion = 0;
        String op = "";
        op = JOptionPane.showInputDialog("Seleccione una opción; \n"
                + "1.- Vender articulo\n"
                + "2.- Crear cliente\n"
                + "3.- Generar factura\n");
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Su venta fue exitosa");
            case 2 ->
                JOptionPane.showMessageDialog(null, "El cliente fue creado");
            case 3 ->
                JOptionPane.showMessageDialog(null, "La factura se genero correctamente");
        }
        System.exit(0);
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getEmpleado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
