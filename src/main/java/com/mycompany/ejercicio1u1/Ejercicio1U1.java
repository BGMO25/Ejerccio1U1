/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1u1;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1U1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var gato1 = new Gato();
        gato1.nombre = "Bigotes";
        gato1.raza = "Persa";
        gato1.edad = 2;
        gato1.pesokg = 4;
        
        System.out.println("El nombre del gato es:"+gato1.nombre);
        System.out.println("Su raza es:"+gato1.raza);
        System.out.println("Su edad es:"+gato1.edad+"años");
        System.out.println("Su peso es:"+gato1.pesokg+"kg");
        
        var auto1 = new Auto();
        auto1.marca = "TOYOTA";
        auto1.color = "Rojo";
        auto1.kilometraje = 212325;
        auto1.año = 2010;
        
        System.out.println("La marca del auto es:"+auto1.marca);
        System.out.println("Su color es:"+auto1.color);
        System.out.println("Su kilometraje es:"+auto1.kilometraje);
        System.out.println("año del auto:"+auto1.año);
        
        var telefono1 = new Telefono();
        telefono1.marca = "NOKIA";
        telefono1.operadora = "CNT";
        telefono1.numero = "0960193325";
        telefono1.año = 2022;
        
        System.out.println("La marca del telefono es:"+telefono1.marca);
        System.out.println("Su operadora es:"+telefono1.operadora);
        System.out.println("Su numero es:"+telefono1.numero);
        System.out.println("año de fabricacion:"+telefono1.año);
        
        var persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.cedula = "010524035-3";
        persona1.edad = 32;
        persona1.altura = 1.7;
        
        System.out.println("Nombre de la persona:"+persona1.nombre);
        System.out.println("Su numero de cedula es:"+persona1.cedula);
        System.out.println("Su edad es:"+persona1.edad);
        System.out.println("Su altura es:"+persona1.altura);
        
        var moto1 = new Moto();
        moto1.marca = "HONDA";
        moto1.placa = "ABA858";
        moto1.precio = 1500;
        moto1.año = 2020;
        
        System.out.println("La marca de la moto es:"+moto1.marca);
        System.out.println("Su placa es:"+moto1.placa);
        System.out.println("Su precio es:"+moto1.precio);
        System.out.println("Su año:"+moto1.año);
    }
}
