/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pracej5;

/**
 *
 * @author cris
 */
public class Minecraft {
    private String[] jug;
    private int[] diamante;
    private int cant;

    public Minecraft() {
        jug=new String[10];
        diamante=new int[10];
        cant =0;
    }
    public void agregarJ(String nombre, int diam) {
        if (cant<10) {
            jug[cant]=nombre;
            diamante[cant]=diam;
            cant++;
        } else {
            System.out.println("Servidor lleno");
        }
    }
    public void stackDiamante() {
        for (int i=0;i<cant; i++) {
            int stacks = diamante[i]/64;
            System.out.println(jug[i]+ " tiene " +stacks+" stacks de diamante");
        }
    }
    public void jMasDiamantes() {
        int mayor = diamante[0];
        String nombre = jug[0];
        for (int i = 1; i < cant; i++) {
            if (diamante[i] > mayor) {
                mayor = diamante[i];
                nombre = jug[i];
            }
        }
        System.out.println("Jugador con mas diamantes: " + nombre);
    }
    public void totalD() {
        int total = 0;

        for (int i = 0; i < cant; i++) {
            total += diamante[i];
        }
        System.out.println("Total de diamantes en el server: "+total);
    }
}
