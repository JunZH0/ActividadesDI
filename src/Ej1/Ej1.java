package Ej1;

public class Ej1 {
    public static void main(String[] args) {

        // Ej1
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int temp;

        System.out.println("Lo valores iniciales de a, b, c, d son :" + a + ", " + b + ", " + c +", " + d);
        temp = d;
        d = b;

        System.out.println("El valor de d cambiada es " + d);

        b = c;
        System.out.println("El valor de b cambiado es " + b);

        c = a;
        System.out.println("El valor de c cambiada es " + c);

        a = temp;
        System.out.println("El valor de a cambiada es " + a);



    }

}