package Ej3;

import java.util.Scanner;

public class EjSwitch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = 2;
        int numDias = 0;

        System.out.println("Introduce el año que quieres saber si es bisiesto ");
        int anBis = Integer.parseInt(sc.nextLine());

        sc.close();


        if (((anBis % 4 == 0) && !(anBis % 100 == 0))
                || (anBis % 400 == 0)) {
                    numDias = 29;
                    System.out.println("Este año es bisiesto " + "Numero de dias de Febrero : " + numDias );
             } else {
                    numDias = 28;
                    System.out.println("Este año no es bisiesto " + "Numero de dias de Febrero : " + numDias );
                }

        }

    }

