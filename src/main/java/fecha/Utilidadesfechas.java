package fecha;

import java.util.Scanner;
import java.time.LocalDate;

public class Utilidadesfechas {
    // Esta clase va a tenr todos los métodos.

    private Scanner tec = new Scanner(System.in);

    // este método "isLeapYear" directamente es una función que nos compruea si el
    // año que hemos solicitado es bisiesto o no
    // En nuestro caso como hemos dicho "now" hemos puesto la fecha como si fuera el
    // dia de hoy.

    // Método 1.
    // bisiesto(LocalDate fecha): devolverá si el año de la fecha es bisiesto o no.
    public static boolean mesBisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    // Método 2.
    // copia(LocalDate fecha): devolverá un nuevo objeto LocalDate haciendo una
    // copia de fecha.
    public static LocalDate copia(LocalDate fecha) {
        LocalDate copia1 = LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
        return copia1;
    }

    // Método 3.
    // diasMes(LocalDate fecha): devolverá el número de días que tiene el mes para
    // la fecha.
    public static LocalDate diasMes(LocalDate fecha) {
        return diasMes(fecha);
    }

    // Método 4.
    // diaSemana(LocalDate fecha): devolverá el día de la semana de la fecha (0 para
    // domingo, ..., 6 para sábado)
    public static LocalDate diaSemana(LocalDate fecha){
        return diaSemana(fecha);
    }

    // Formato fecha larga
    /*
     * DAteTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
     * String fechaString = hoy.format(formato);
     * Sout("Fecha sin formato " + hoy);
     * sout("Fecha con formato " + fechaString);
     * 
     */
}