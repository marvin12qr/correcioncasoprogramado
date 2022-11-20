package com.mycompany.casoprogramado;

import AdministradorColaborador.Administrador;
import AdministradorColaborador.Colaborador;
import ClienteProveedor.Clientes;
import ClienteProveedor.Proveedor;
import Producto.Productos;

public class CasoProgramado {

    public static void main(String[] args) {

        Administrador administrador1 = new Administrador();
        Colaborador colaborador1 = new Colaborador();
        Proveedor proveedor1 = new Proveedor();
        Clientes clientes1 = new Clientes();
        Productos productos1 = new Productos();

        administrador1.Login();
        administrador1.mostrarDatos();

        administrador1.setNombre("Orlando");
        String nombre = administrador1.getNombre();
        administrador1.setApellido("Acuña");
        String apellido = administrador1.getApellido();
        administrador1.setEdad(30);
        int edad = administrador1.getEdad();
        administrador1.setId(02);
        int id = administrador1.getId();

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su Edad es: " + edad);
        System.out.println("Su ID es: " + id);

        colaborador1.Login1();
        colaborador1.mostrarDatos();

        colaborador1.setNombre("Laura");
        String nombre1 = colaborador1.getNombre();
        colaborador1.setApellido("Fernández");
        String apellido1 = colaborador1.getApellido();
        colaborador1.setEdad(22);
        int edad1 = colaborador1.getEdad();
        colaborador1.setEmpleado(04);
        int empleado = colaborador1.getEmpleado();

        System.out.println("Su nombre es: " + nombre1);
        System.out.println("Su Apellido es: " + apellido1);
        System.out.println("Su Edad es: " + edad1);
        System.out.println("Su número de empleado es : " + empleado);

        proveedor1.mostrarDatos();

        proveedor1.setNombre("Office Depot");
        String nombre2 = proveedor1.getNombre();
        proveedor1.setTelefono("24505534");
        String telefono = proveedor1.getTelefono();
        proveedor1.setDireccion("Alajuela");
        String direccion = proveedor1.getDireccion();
        proveedor1.setId(02);
        int id2 = proveedor1.getId();

        System.out.println("El nombre del proveedor es: " + nombre2);
        System.out.println("Su Teléfono es: " + telefono);
        System.out.println("Su dirección es: " + direccion);
        System.out.println("Su ID es : " + id2);

        clientes1.mostrarDatos();

        clientes1.setNombre("Orlando");
        String nombre3 = clientes1.getNombre();
        clientes1.setApellido("Acuña");
        String apellido3 = clientes1.getApellido();
        clientes1.setEdad(30);
        int edad3 = clientes1.getEdad();
        clientes1.setCedula(02);
        int cedula = clientes1.getCedula();
        clientes1.setTelefono(64515228);
        int telefono3 = clientes1.getTelefono();
        clientes1.setCorreo("Jocelynpizarro131@gmail.com");
        String correo = clientes1.getCorreo();

        System.out.println("Su nombre es: " + nombre3);
        System.out.println("Su Apellido es: " + apellido3);
        System.out.println("Su Edad es: " + edad3);
        System.out.println("Su ID es: " + cedula);
        System.out.println("Su Teléfono es: " + telefono3);
        System.out.println("Su correo es: " + correo);

        productos1.mostrarDatos();

        productos1.setDescripcion("Etiquetas");
        String descripcion = productos1.getDescripcion();
        productos1.setGarantia("2 años");
        String garantia = productos1.getGarantia();
        productos1.setPrecio(1500);
        int precio = productos1.getPrecio();

        System.out.println("Selecciono Producto: " + descripcion);
        System.out.println("La garantia será: " + garantia);
        System.out.println("El precio será: " + precio);

        administrador1.menu();
        colaborador1.menu1();
        proveedor1.menu1();
        clientes1.menu2();

    }
}
