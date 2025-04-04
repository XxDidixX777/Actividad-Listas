/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginjava;

import Ventana.Ventana;

/**
 *
 * @author Sala de Sistemas
 */
public class LoginJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Ejecutar la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crear una instancia de la ventana y hacerla visible
                new Ventana().setVisible(true);
            }
        });
    }
}
