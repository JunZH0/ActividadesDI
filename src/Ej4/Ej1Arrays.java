package Ej4;

import java.util.Scanner;

public class Ej1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un valor numerico");
            int num = Integer.parseInt(sc.nextLine());
            valores[i] = num;
            media = media + valores[i];
        }
        media = media / valores.length;
        System.out.println("La media de valores es " + media);
        sc.close();
    }
}
