package com.danielbuscor.challengeconversor.alurag9.utilidades;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);


    //El menu principal servira de puerta de entrada al programa
    public void menuPrincipal() {
        System.out.println("Por favor selecciona una opcion");
        System.out.println("1. Realizar conversion");
        System.out.println("2. Ver monedas disponibles");
        System.out.println("3. Salir");
    }

    //Este menu contiene las conversiones disponibles
    public void menu1() {
        System.out.println("*** Selecciona la conversion que quieres realizar ***");
        System.out.println("1. USD a BOB");
        System.out.println("2. BOB a USD ");
        System.out.println("3. USD a ARS");
        System.out.println("4. ARS a USD");
        System.out.println("5. USD a BRL");
        System.out.println("6. BRL a USD");
        System.out.println("7. Salir");
    }


    //Este menu informativo muestra las divisas disponibles para hacer el cambio, quizas implemente
    //el tipo de cambio actual de cada moneda respecto al dolar si me alcanza el tiempo

    public void menu2() {
        System.out.println("**************** Divisas Disponibles ****************");
        System.out.println(" ");
        System.out.println("1. Dolar Americano (USD)");
        System.out.println("2. Peso Argentino (ARS)");
        System.out.println("3. Peso Boliviano (BOB)");
        System.out.println("4. Real Brasilero (BRL)");
    }

    public void separadorVisual() {
        System.out.println("*******************************************");
    }
}
