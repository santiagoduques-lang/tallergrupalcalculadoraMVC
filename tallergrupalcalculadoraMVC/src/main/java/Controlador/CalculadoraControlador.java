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
    
public double restar(double numero1, double numero2) {

        Resta resta = new Resta(numero1, numero2);

        return resta.calcular();
    }

public double multiplicar(double numero1, double numero2) {

        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);

        return multiplicacion.calcular();
    }

public double dividir(double numero1, double numero2) {

        Division division = new Division(numero1, numero2);

        return division.calcular();
    }

public double raizCuadrada(double numero1) {

        RaizCuadrada raiz = new RaizCuadrada(numero1, 0);

        return raiz.calcular();
    }

    public double raizCubica(double numero1) {

        RaizCubica raiz = new RaizCubica(numero1, 0);

        return raiz.calcular();
    }
    
public double logaritmoNatural(double numero1) {

        LogaritmoNatural logaritmo = new LogaritmoNatural(numero1, 0);

        return logaritmo.calcular();
    }
}
}}