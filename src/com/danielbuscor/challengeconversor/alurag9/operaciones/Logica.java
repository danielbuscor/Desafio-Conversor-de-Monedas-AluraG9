package com.danielbuscor.challengeconversor.alurag9.operaciones;


import com.danielbuscor.challengeconversor.alurag9.operaciones.APIServicios;
import com.danielbuscor.challengeconversor.alurag9.utilidades.Menu;

import java.util.Scanner;

public class Logica {
    // Variables de instancia
    private Scanner input;
    private Menu menu;
    private APIServicios apiServicios;

    // Constructor
    public Logica() {
        this.input = new Scanner(System.in);
        this.menu = new Menu();
        this.apiServicios = new APIServicios();
    }

    //El siguiente metodo inicia el programa
    public void iniciarPrograma() {
        System.out.println("\n¡Bienvenido al Conversor de Monedas!\n");
        ejecutarMenuPrincipal();
        cerrarRecursos();
        System.out.println("\n¡Gracias por usar el conversor de monedas!");
        System.out.println("¡Hasta pronto!");
    }

    //Ejecuta el loop del menu principal
    private void ejecutarMenuPrincipal() {
        boolean continuar = true;

        while (continuar) {
            menu.menuPrincipal();
            int opcion = validarOpcionMenuPrincipal();

            switch (opcion) {
                case 1: // Realizar conversión
                    procesarOpcionConversion();
                    break;
                case 2: // Ver divisas disponibles
                    mostrarDivisasDisponibles();
                    break;
                case 3: // Salir
                    continuar = false;
                    break;
            }
        }
    }

    //Lo siguiente procesa el menu conversiones
    private void procesarOpcionConversion() {
        boolean volverMenuPrincipal = false;

        while (!volverMenuPrincipal) {
            menu.separadorVisual();
            menu.menu1();
            int opcion = validarOpcionMenuConversion();

            if (opcion == 7) { // Volver al menú principal
                volverMenuPrincipal = true;
            } else {
                boolean deseaVolver = ejecutarConversionSegunOpcion(opcion);
                if (deseaVolver) {
                    volverMenuPrincipal = true;
                }
            }
        }
    }

    //Ejecutar la conversion segun la opcion seleccionada
    private boolean ejecutarConversionSegunOpcion(int opcion) {
        switch (opcion) {
            case 1: // USD a BOB
                return ejecutarConversion("USD", "BOB");
            case 2: // BOB a USD
                return ejecutarConversion("BOB", "USD");
            case 3: // USD a ARS
                return ejecutarConversion("USD", "ARS");
            case 4: // ARS a USD
                return ejecutarConversion("ARS", "USD");
            case 5: // USD a BRL
                return ejecutarConversion("USD", "BRL");
            case 6: // BRL a USD
                return ejecutarConversion("BRL", "USD");
            default:
                return false;
        }
    }

    //ejecuta la conversion especifica
    private boolean ejecutarConversion(String moneda1, String moneda2) {
        double cantidad = solicitarCantidad();

        try {
            double resultado = apiServicios.realizaConversion(moneda1, moneda2, cantidad);
            mostrarResultado(cantidad, moneda1, resultado, moneda2);
            return preguntarContinuar();
        } catch (Exception e) {
            System.out.println("\n Error al realizar la conversión.");
            System.out.println("Por favor, verifica tu conexión a internet e intenta nuevamente.\n");
            return preguntarContinuar();
        }
    }

    //Solicita al usuario la cantidad a convertir
    private double solicitarCantidad() {
        while (true) {
            System.out.print("Por favor ingrese la cantidad que desea convertir: ");

            if (input.hasNextDouble()) {
                double cantidad = input.nextDouble();
                input.nextLine(); // Limpiar buffer

                if (cantidad > 0) {
                    return cantidad;
                } else {
                    System.out.println(" Error: La cantidad debe ser mayor a cero.\n");
                }
            } else {
                System.out.println(" Error: Por favor ingrese solo números.\n");
                input.nextLine(); // Limpiar buffer
            }
        }
    }

    //Muestra el resultado de la conversion
    private void mostrarResultado(double cantidadOriginal, String moneda1,
                                  double cantidadConvertida, String moneda2) {
        menu.separadorVisual();
        System.out.println(String.format("✓ %.2f %s equivalen a %.2f %s",
                cantidadOriginal, moneda1, cantidadConvertida, moneda2));
        menu.separadorVisual();
    }

    //Muestra las divisas disponibles
    private void mostrarDivisasDisponibles() {
        menu.separadorVisual();
        menu.menu2();
        System.out.println("Presione Enter para continuar...");
        input.nextLine();
    }

    //Pregunta al usuario si desea continuar con otra conversion o si quiere volver al menu principal
    private boolean preguntarContinuar() {
        System.out.println("\n¿Qué desea hacer?");
        System.out.println("1. Realizar otra conversión");
        System.out.println("2. Volver al menú principal");

        while (true) {
            System.out.print("\nSeleccione una opción: ");

            if (input.hasNextInt()) {
                int opcion = input.nextInt();
                input.nextLine(); // Limpiar buffer

                if (opcion == 1) { // Continuar
                    return false;
                } else if (opcion == 2) { // Volver
                    return true;
                } else {
                    System.out.println(" Opción inválida. Por favor seleccione 1 o 2.");
                }
            } else {
                System.out.println(" Por favor ingrese un número válido (1 o 2).");
                input.nextLine(); // Limpiar buffer
            }
        }
    }

    //Valida la opcion del menu principal
    private int validarOpcionMenuPrincipal() {
        while (true) {
            System.out.print("Seleccione una opción: ");

            if (input.hasNextInt()) {
                int opcion = input.nextInt();
                input.nextLine(); // Limpiar buffer

                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                } else {
                    System.out.println(" Opción inválida. Por favor seleccione una opción entre 1 y 3.\n");
                }
            } else {
                System.out.println(" Por favor ingrese un número válido.\n");
                input.nextLine(); // Limpiar buffer
            }
        }
    }

    //Valida la opcion del menuConversion
    private int validarOpcionMenuConversion() {
        while (true) {
            System.out.print("Seleccione una opción: ");

            if (input.hasNextInt()) {
                int opcion = input.nextInt();
                input.nextLine(); // Limpiar buffer

                if (opcion >= 1 && opcion <= 7) {
                    return opcion;
                } else {
                    System.out.println(" Opción inválida. Por favor seleccione una opción entre 1 y 7.\n");
                }
            } else {
                System.out.println(" Por favor ingrese un número válido.\n");
                input.nextLine(); // Limpiar buffer
            }
        }
    }

    //Cierre de los recursos usados
    private void cerrarRecursos() {
        if (input != null) {
            input.close();
        }
    }
}
