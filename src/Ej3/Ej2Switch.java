package Ej3;

import java.util.Scanner;

public class Ej2Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mes del año en forma de numero");

        String[] listaMes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
                "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        int mes = Integer.parseInt(sc.nextLine());
        int numDias = 0;

        if (!(numDias > 12 || numDias < 0)) {
            switch (mes) {
                case 2:
                    numDias = 28;
                    break;
                case 4: case 6:
                case 9: case 11:
                    numDias = 30;
                    break;
                case 1: case 3: case 5:
                case 7: case 8: case 10: case 12:
                    numDias = 31;
                    break;
            }
            // Se resta uno al mes porque el indice del array empieza en 0
            System.out.println("El mes " + listaMes[mes - 1] + " tiene "+ numDias + " dias" );
        } else {
            System.out.println("El mes introducido no es valido");
        }

        sc.close();
    }
}
