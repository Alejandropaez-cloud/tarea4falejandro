package fecha;

import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Utilidadesfechas {
    // Esta clase va a tenr todos los métodos.

    // este método "isLeapYear" directamente es una función que nos compruea si el
    // año que hemos solicitado es bisiesto o no
    // En nuestro caso como hemos dicho "now" hemos puesto la fecha como si fuera el
    // dia de hoy.

    // Método 1.
    // bisiesto(LocalDate fecha): devolverá si el año de la fecha es bisiesto o no.
    public static boolean mesBisiesto(LocalDate fechaPropuesta) {
        return fechaPropuesta.isLeapYear();
    }

    // Método 2.
    // copia(LocalDate fecha): devolverá un nuevo objeto LocalDate haciendo una
    // copia de fecha.
    public static LocalDate copia(LocalDate fechaPropuesta) {
        LocalDate copia1 = LocalDate.of(fechaPropuesta.getYear(), fechaPropuesta.getMonth(), fecha.getDayOfMonth());
        return copia1;
    }

    // Método 3.
    // diasMes(LocalDate fecha): devolverá el número de días que tiene el mes para
    // la fecha.
    public static int diasMes(LocalDate fechaPropuesta) {
        return fechaPropuesta.lengthOfMonth();
    }

    // Método 4.
    // diaSemana(LocalDate fecha): devolverá el día de la semana de la fecha (0 para
    // domingo, ..., 6 para sábado)
    public static int diaSemana(LocalDate fechaPropuesta) {
        int diaSemana = fechaPropuesta.getDayOfWeek().getValue();
        if (diaSemana == 7) {
            System.out.println("El dia de hoy es 0");
            return 0;
        } else {
            System.out.println("El día de hoy es" + diaSemana);
            return diaSemana;
        }
    }

    // Método 5.
    // mostrarFechaLarga(LocalDate fecha): mostrará la fecha en formato largo,
    // empezando por el día de la semana (ejemplo: martes 2 de septiembre de 2003).
    // Formato fecha larga
    public static void mostrarFechaLarga(LocalDate fechaPropuesta) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD MM YYYY");
        String fechaLarga = fechaPropuesta.format(formato);
        System.out.println(fechaLarga);
    }

    // Método 6.
    // sumarDias(long numeroDias, LocalDate fecha): devolverá una nueva fecha
    // después de haber sumado los días que se pasan como parámetro al objeto fecha.
    public static LocalDate sumarDias(long numeroDias, LocalDate fechaPropuesta) {
        LocalDate diasSumados = fechaPropuesta.plus(numeroDias, ChronoUnit.DAYS);
        System.out.println("Si a la fecha " + fechaPropuesta + numeroDias + diasSumados);
        return diasSumados;
    }

    // Método 7.
    // diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal): método que
    // devolverá el número de días transcurridos desde la fecha inicial hasta la
    // fecha final.
    public static long diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal) {
        long diasHastaFinal = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        System.out.println("Los días que han transcurrido desde " + fechaInicial + " hasta " + fechaFinal + " son "
                + diasHastaFinal);

        return diasHastaFinal;
    }

    // Método 8.
    // siguienteDia(LocalDate fecha): devolverá un nuevo objeto LocalDate, pasando
    // al día siguiente de la fecha pasada.
    public static LocalDate siguienteDia(LocalDate fechaPropuesta) {
        LocalDate diasSumados = fechaPropuesta.plus(1, ChronoUnit.DAYS);
        System.out.println(
                "Si a la fecha " + fechaPropuesta + "le sumamos 1 dia" + "la nueva feceha será " + diasSumados);
        return diasSumados;
    }

    // Método 9.
    // anteriorDia(LocalDate fecha): igual que el método anterior pero pasando al
    // día anterior.
    public static LocalDate DiaAnterior(LocalDate fechaPropuesta) {
        LocalDate diasSumados = fechaPropuesta.minus(1, ChronoUnit.DAYS);
        System.out.println(
                "Si a la fecha " + fechaPropuesta + "le restamos 1 dia" + "la nueva feceha será " + diasSumados);
        return diasSumados;
    }

    // Método 10.
    // minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2): calcula los minutos
    // entre los dos objetos, fecha1 y fecha2.
    public static long minutos (LocalDateTime PrimeraFecha, LocalDateTime SegundaFecha) {
        Long minutos = ChronoUnit.MINUTES.between(PrimeraFecha, SegundaFecha);
        System.out.println("Los minutos que han transcurrido desde " + PrimeraFecha + " hasta " + SegundaFecha " son " + minutos + " minutos ");
        return minutos;

    }

    // Método 11.
    // sumarSegundos(long numeroSegundos, LocalDateTime fecha): devolverá un nuevo
    // objeto LocalDateTime después de haber sumado los segundos que se pasan como
    // parámetro.
    public static LocalDateTime sumarSegundos (long numeroSegundos, LocalDateTime fechaPropuesta) {
        LocalDateTime segundossumados = fechaPropuesta.plus(numeroSegundos, ChronoUnit.SECONDS);
        System.out.println("Si a la fecha " + fechaPropuesta + " le sumamos " + numeroSegundos + " segundos, la nueva fecha será " + segundossumados);
        return segundossumados;
    }
}
