/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oriana
 */
public class Suma extends Operacion {

    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 + numero2;
    }
}