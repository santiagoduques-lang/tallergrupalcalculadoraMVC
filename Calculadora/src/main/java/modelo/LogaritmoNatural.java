/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oriana
 */
public class LogaritmoNatural extends Operacion {

    public LogaritmoNatural(double numero1, double numero2) {
        super(numero1, numero2);
    }

    public double calcular() {
        return Math.log(numero1);
    }
}