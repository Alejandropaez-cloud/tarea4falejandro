package fecha;

import java.time.LocalDate;
import java.time.MonthDay;

public class Utilidadesfechas {
    // Esta clase va a tenr todos los métodos.

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
        LocalDate diasMes = LocalDate.of(1, 12, 1976);
        MonthDay diaMes = MonthDay.of(diasMes.getMonth(), diasMes.getDayOfMonth());
        MonthDay diaMeshoy = MonthDay.from(LocalDate.now());

        if (diaMes.equals(diaMeshoy)) {
            System.out.println("Hoy es tu puto día. Coño espabila");
        }
        return diasMes(fecha);
    }

    // Método 4.
    // diaSemana(LocalDate fecha): devolverá el día de la semana de la fecha (0 para
    // domingo, ..., 6 para sábado)
    public static LocalDate diaSemana(LocalDate fecha) {
        return diaSemana(fecha);
    }

    // Método 5.
    // mostrarFechaLarga(LocalDate fecha): mostrará la fecha en formato largo,
    // empezando por el día de la semana (ejemplo: martes 2 de septiembre de 2003).
    // Formato fecha larga
    public static LocalDate diaformatolargo (LocalDate fecha){
        DAteTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
    String fechaString = hoy.format(formato);
    System.out.println("Fecha sin formato " + hoy);
    sout("Fecha con formato " + fechaString);
    }
