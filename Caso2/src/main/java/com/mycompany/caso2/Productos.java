package com.mycompany.caso2;

public class Productos {

    private int codigo;
    private int cantidad;
    private int precio;


    Productos(int codigo, int cantidad, int precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
       
    }

    Productos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
