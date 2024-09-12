import java.util.Scanner;

public class Practica {

    // Planteamiento del Problema
    // Se necesita un programa que permita la captura de cinco valores
    // correspondientes a radios de círculos.
    // Para cada uno de esos cinco valores se requiere que se calcule y muestre en
    // pantalla los siguientes datos del círculo:
    // 1. Diámetro. Se calcula multiplicando el radio por 2
    // 2. Circunferencia. Se calcula multiplicando el diámetro por pi (3.1416).

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double a = 0, b = 0, c = 0, d = 0, e = 0;

        System.out.println("Indique los 5 números que desea calcular: ");

        System.out.println("Indique el primero");
        a = Integer.parseInt(s.nextLine());

        System.out.println("Indique el segundo");
        b = Integer.parseInt(s.nextLine());

        System.out.println("Indique el tercero");
        c = Integer.parseInt(s.nextLine());

        System.out.println("Indique el indique el cuarto");
        d = Integer.parseInt(s.nextLine());

        System.out.println("Indique el quinto");
        e = Integer.parseInt(s.nextLine());

        System.out.println("Los números indicados: ");
        System.out.println("Primer número: " + a);
        System.out.println("Segundo número: " + b);
        System.out.println("Tercero número: " + c);
        System.out.println("Cuarto número: " + d);
        System.out.println("Quinto número: " + e);

        double diametroA = a * 2, diamertroB = b * 2, diametroC = c * 2, diametroD = d * 2, diametroE = e * 2;

        System.out.println("Los Diametros para cada uno de los numeros indicados: ");
        System.out.println("Diametro 1: " + diametroA);
        System.out.println("Diametro 2: " + diamertroB);
        System.out.println("Diametro 3: " + diametroC);
        System.out.println("Diametro 4: " + diametroD);
        System.out.println("Diametro 5: " + diametroE);

        double pi = 3.1416;

        double circunferenciaA = diametroA * pi, circunferenciaB = diamertroB * pi, circunferenciaC = diametroC * pi,
                circunferenciaD = diametroD * pi, circunferenciaE = diametroE * pi;

        System.out.println("Las circunferencias para cada uno de los numeros indicados: ");
        System.out.println("Circunferencia 1: " + circunferenciaA);
        System.out.println("Circunferencia 2: " + circunferenciaB);
        System.out.println("Circunferencia 3: " + circunferenciaC);
        System.out.println("Circunferencia 4: " + circunferenciaD);
        System.out.println("Circunferencia 5: " + circunferenciaE);
    }
}