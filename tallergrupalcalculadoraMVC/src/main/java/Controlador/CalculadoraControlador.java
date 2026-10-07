/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author gabby
 */
public class CalculadoraControlador {
    
import modelo.Suma;  
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division; 
import modelo.RaizCuadrada; 
import modelo.RaizCubica; 
import modelo.LogaritmoNatural; 

public class CalculadoraControlador {

    public double sumar(double numero1, double numero2) {

        Suma suma = new Suma(numero1, numero2);

        return suma.calcular();
    }

}}