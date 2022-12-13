package com.mycompany.caso2;

import javax.swing.JOptionPane;

public class Menu {
    
    public static void menu1(){

    String opciones[] = {"codigo 1 - Tenis", "codigo 2 - Ropa", "codigo 3 - Perfumes", "codigo 4 - Gorras"};

    String op = (String) JOptionPane.showInputDialog(null,"Elija un codigo: ","Menu",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
    
    JOptionPane.showMessageDialog(null,"Usted selecciono: "+op);
            
    }
            
}
