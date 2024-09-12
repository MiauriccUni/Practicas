import java.util.Scanner;

public class Practica {
    // Planteamiento del Problema
    // Se necesita un programa que permita manejar transacciones de una cuenta.
    // El saldo inicial de la cuenta debe ser de Col. 0.00
    // El programa debe solicitar al usuario que indique si desea realizar un
    // depósito o un retiro.
    // Si el usuario elige hacer un retiro, se solicita un valor y debe verificarse
    // que haya saldo suficiente para retirar. De no ser
    // así se envía un mensaje al usuario notificando esa situación. Si hay saldo
    // suficiente, se resta el valor ingresado al saldo.
    // Si el usuario elige hacer un depósito se solicita un valor y ese valor se
    // suma al saldo.
    // Al final de cada transacción se pregunta al usuario si desea realizar otra
    // transacción. Si contesta afirmativamente, se
    // repiten las acciones anteriores. Si no, se termina el programa, mostrando el
    // saldo final de la cuenta.

    public static double C = 0;

    public static void main(String[] args) throws Exception {

        int opcion = 0;

        select(opcion);

    }

    public static void select(int opcion) {

        Scanner s = new Scanner(System.in);

        do {

            menu();

            System.out.println("Indique una opcion.");

            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Indique un monto a depositar.");
                    double d = Double.parseDouble(s.nextLine());
                    deposito(d);
                    break;
                case 2:
                    System.out.println("Indique el monto que desea retirar.");
                    double r = Double.parseDouble(s.nextLine());
                    retirar(r);
                    break;
                case 3:
                    System.out.println("Su saldo actual es de: " + C);
                    break;
                case 4:
                    System.out.println("!Hasta pronto!");
                    break;
                default:
                    System.out.println("Indique uno de los números indicados en el menú.\n");
                    break;
            }
        } while (opcion != 4);
    }

    public static void deposito(double d) {
        if (d <= 0) {
            System.out.println("El la cantidad del deposito no puede ser menor o igual 0.");
        } else {

            C = C + d;
            System.out.println("Se realizo un deposito de: " + d + " Para un total de: " + C);
        }
    }

    public static void retirar(double r) {
        if (r > C) {
            System.out.println("Su cuenta no tiene los fondos suficientes para cubrir el retiro indicado.");
            ;
        } else {
            C = C - r;
            System.out.println("Se realiaz su retiro, su Saldo actual es de: " + C);
        }

    }

    public static void menu() {

        System.out.println("**********************************Menú***********************************");
        System.out.println("Por favor indique 1 para realizar un deposito.");
        System.out.println("Por favor indique 2 para realizar un retiro. ");
        System.out.println("Por favor indique 3 para consultar su saldo de la aplicación.");
        System.out.println("Por favor indique 4 para salir de la aplicación.");
        System.out.println("*************************************************************************");
    }

}