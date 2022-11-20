
package AdministradorColaborador;

import javax.swing.JOptionPane;

public class Administrador {
    
        //Atributos//
    private String nombre;
    private String apellido;
    private int edad;
    private int id;

    //Constructor //
    public Administrador() {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;

    }

    public void mostrarDatos() {
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        System.out.println("El nombre del Administrador es: " + nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        System.out.println("Su Apellido es: " + apellido);
        String edad = JOptionPane.showInputDialog("Ingrese su Edad");
        System.out.println("Su Edad es: " + edad);
        String id = JOptionPane.showInputDialog("Ingrese su ID");
        System.out.println("Su ID es: " + id);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void Login() {
        //login administrador
        int intentos = 0;
        while (intentos < 3) {

            String U = "admin";
            String P = "123";

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

    public void menu() {

        //menu administrador
        int opcion = 0;
        String op = "";
        op = JOptionPane.showInputDialog("Seleccione una opción; \n"
                + "1.- Planillas\n"
                + "2.- Contabilidad\n"
                + "3.- Información de clientes\n");
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Planillas");
            case 2 ->
                JOptionPane.showMessageDialog(null, "Bienvenido a la Contabilidad de la compañia");
            case 3 ->
                JOptionPane.showMessageDialog(null, "Bienvenido al portal de clientes");
        }
        System.exit(0);

    }
    
}
