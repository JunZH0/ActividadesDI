package Ej2;

import java.util.Scanner;

public class Ej4 {

    static final double  PI = 3.14;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce al radio de la circunferencia");
        double rad = Double.parseDouble(sc.nextLine());


        System.out.println("La longitud de la circunferencia es: " + 2 * PI * rad + ", y el area es " + PI * (rad * rad));

        sc.close();
    }
}
