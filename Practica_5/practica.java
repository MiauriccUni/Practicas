import java.time.LocalDate;
import java.time.Period;

public class practica {

    // Crea dos variables utilizando los objetos fecha (date):
    // * - Una primera que represente la fecha (día, mes, año) actual.
    // * - Una segunda que represente tu fecha de nacimiento.
    // * Calcula cuántos años han transcurrido entre ambas fechas.

    public static void main(String[] args) throws Exception {

        LocalDate myBirDate = LocalDate.of(2000, 03, 16);

        LocalDate fechaActual = LocalDate.now();

        Period p = Period.between(myBirDate, fechaActual);

        int age = p.getYears();

        int monts = p.getMonths();

        int days = p.getDays();

        System.out.println("Mi edad es: " + age + ", mis meses son: " + monts + ", mis dias son: " + days);
    }
}