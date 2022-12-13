package com.mycompany.caso2;

import static com.mycompany.caso2.Menu.menu1;

public class Caso2 {

    public static void main(String[] args) {

        Productos listaProductos[] = new Productos[4];

        listaProductos[0] = new Productos(1, 5, 500);
        listaProductos[1] = new Productos(2, 7, 1500);
        listaProductos[2] = new Productos(3, 3, 2000);
        listaProductos[3] = new Productos(4, 8, 1000);
        
        

        for (int i = 0; i < listaProductos.length; i++) {
            System.out.println(listaProductos[i]);

        }

        System.out.println("La matriz seria: ");
        
        int matriz[][] = {{1, 5, 500}, {2, 7, 1500}, {3, 3, 2000}, {4, 8, 1000}};
        int i = 0;
        while (i < 4) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
            i++;
        }
        
        menu1();

    }
}
