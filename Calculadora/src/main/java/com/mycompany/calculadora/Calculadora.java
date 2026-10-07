/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JFrame;
import vista.interfaz_Grafica;

/**
 *
 * @author orian
 * @author santi
 */
public class Calculadora {

      public static void main(String[] args) {

    JFrame frame = new JFrame("Calculadora MVC");
        interfaz_Grafica panel = new interfaz_Grafica();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    }


