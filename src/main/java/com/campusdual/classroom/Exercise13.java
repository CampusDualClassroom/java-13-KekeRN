package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad a 20 litros");
        ft.setActualFuel(20);
        ft.showDetails();

        System.out.println("Intento de actualización con valor negativo:");
        ft.setActualFuel(-5);
        ft.showDetails();
    }
}