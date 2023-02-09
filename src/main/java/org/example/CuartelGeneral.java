package org.example;


import clases.Villano;
import org.example.paquetico.Pareja;


public class CuartelGeneral {

    public static void main(String[] args) {
        Heroe heroe=new Heroe();
        heroe.setNombre("Batman");
        heroe.setPoder(800);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPoder());


        Villano villano = new Villano();

        Pareja pareja = new Pareja("Emmanuel");
    }
}