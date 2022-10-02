package Ej2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor de temperatura en Fahrenheit");
        double tempF = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println("La temperatura de hoy dia en Centigrados es" + (tempF - 32) / 1.8 + " Celcius" +
                "\n La temperatura de hoy dia en Fahrenheit es " + tempF + "Fahrenheit");
    }
}
