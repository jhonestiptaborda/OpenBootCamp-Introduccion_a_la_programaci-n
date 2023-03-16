/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasefunciones;

/**
 *
 * @author jt255033
 */
public class ClaseFunciones {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        /*Llamar a la función en el main y darle valores.*/
        suma(1,2,3);
    }
    
    /*Crear una función con tres parámetros que sean números que se suman entre sí.*/
    public static void suma(int a, int b, int c){
        int suma = a+b+c;
        System.out.println(suma);
        
        Coche miCoche  = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.numPuertas);
    }
    
    
}

/*Crear clase coche*/
class Coche{
    /*variable que almacena el numero de puertas*/
    int numPuertas = 0;
    
    /*metodo que suma puertas*/
    public void sumarPuertas(){
        this.numPuertas ++;
    }
}


