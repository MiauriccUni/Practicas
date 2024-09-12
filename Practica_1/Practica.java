import java.util.Scanner;

public class Practica {

    // Planteamiento del Problema
    // Dados tres números calcule:
    //  La suma de los tres
    //  El promedio de los tres
    //  El producto de los tres
    // Además determine:
    //  El menor de los tres

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner s = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.println("Ingrese el primer número");
        a = Integer.parseInt(s.nextLine());

        System.out.println("Ingrese el segundo número");
        b = Integer.parseInt(s.nextLine());

        System.out.println("Ingrese el tercer número");
        c = Integer.parseInt(s.nextLine());

        sum(a, b, c);
        average(a, b, c);
        product(a, b, c);

        minor(a, b, c);

    }

    public static void sum(int a, int b, int c) {

        int total = a + b + c;
        System.out.println("La suma es: " + total);
    }

    public static void average(int a, int b, int c) {

        int aver = a + b + c;
        int averT = aver / 3;
        System.out.println("Este es el promedio: " + averT);
    }

    public static void product(int a, int b, int c) {
        int p = a * b * c;
        System.out.println("Este es el producto: " + p);
    }

    public static int minA(int[] array) {
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < a) {
                a = array[i];
            }
        }

        return a;
    }

    public static void minor(int a, int b, int c) {
        int[] array = { a, b, c };
        int minb = minA(array);

        System.out.println("El numero menor es: " + minb);
    }
}
