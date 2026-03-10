/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pracej4;

/**
 *
 * @author cris
 */
public class Bus {
    private int cap;
    private int pasajer;
    private double dinero;

    public Bus(int capacidad) {
        this.cap=capacidad;
        this.pasajer=0;
        this.dinero=0;
    }

    public void subirP(int x) {
        if (pasajer+x<=cap) {
            pasajer+=x;
        } else {
            System.out.println("No hay suficientes asientos.");
        }
    }

    public void cobrarP() {
        dinero=pasajer*1.50;
    }

    public int asientoDispo() {
        return cap-pasajer;
    }

    public void mostrar() {
        System.out.println("Pasajeros: "+pasajer);
        System.out.println("Dinero recaudado: "+dinero);
        System.out.println("Asientos disponibles: "+asientoDispo());
    }
}
