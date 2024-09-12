import java.util.Scanner;

public class Practica {

    // Escribe un programa que, dado un número, compruebe y muestre si es
    // primo(hasta el 100), fibonacci y par.
    // * Ejemplos:
    // Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
    // Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"

    // Se deben crear las funciones para cada uno de las comprobaciones.

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int condition = 0;

        System.out.println("Por favor, indique el numero a calcular.");
        int c = Integer.parseInt(s.nextLine());
        if (primos(c)) {
            System.out.println("El numero: " + c + " Es primo");
        } else {
            System.out.println("El numero: " + c + " No es primno");
        }

        if (par(c)) {
            System.out.println("El numero: " + c + " es par");
        } else {
            System.out.println("El numero: " + c + " No es par");
        }

        if (fibo(c)) {
            System.out.println("El numero: " + c + " es fibo");
        } else {
            System.out.println("El numero: " + c + " no es fibo");
        }

    }

    public static boolean primos(double pr) {

        if (pr <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(pr); i++) {
            if (pr % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean par(double pa) {

        boolean l = true;

        if (pa % 2 != 0) {
            l = false;
        }

        return l;
    }

    public static boolean fibo(double fi) {

        return is(5 * fi * fi + 4) || is(5 * fi * fi - 4);
    }

    public static boolean is(double n) {

        double s = Math.sqrt(n);
        return (s - Math.floor(s)) == 0;
    }
}
