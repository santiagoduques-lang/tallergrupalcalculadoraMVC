package controlador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabby
 */

import modelo.Operacion;
import modelo.Suma;
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division;
import modelo.RaizCuadrada;
import modelo.RaizCubica;
import modelo.LogaritmoNatural;


public class CalculadoraControlador {
    
         public double sumar(double numero1, double numero2) {

        Operacion operacion = new Suma(numero1, numero2);

        return operacion.calcular();
}

 public double restar(double numero1, double numero2) {

        Operacion operacion = new Resta(numero1, numero2);

        return operacion.calcular();
    }
     public double multiplicar(double numero1, double numero2) {

        Operacion operacion = new Multiplicacion(numero1, numero2);

        return operacion.calcular();
    }
     
       public double dividir(double numero1, double numero2) {

        Operacion operacion = new Division(numero1, numero2);

        return operacion.calcular();
    }
    public double raizCuadrada(double numero1) {

        Operacion operacion = new RaizCuadrada(numero1, 0);

        return operacion.calcular();
    }

    public double raizCubica(double numero1) {

        Operacion operacion = new RaizCubica(numero1, 0);

        return operacion.calcular();
    }
    public double logaritmoNatural(double numero1) {

        Operacion operacion = new LogaritmoNatural(numero1, 0);

        return operacion.calcular();
    }

}
