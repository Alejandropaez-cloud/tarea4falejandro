package fecha;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Declaración.
        LocalDate fecha = LocalDate.now();
        LocalDate copia = Utilidadesfechas.copia(fecha);
        LocalDate diaMes = Utilidadesfechas.diasMes(fecha);
        
        // Impresión.
        System.out.println(Utilidadesfechas.copia(fecha));
        System.out.println("¿Es bisiesto?: " + Utilidadesfechas.mesBisiesto(fecha));
        System.out.println("El dia de la semana de la fecha es: " + Utilidadesfechas.diaSemana(fecha));
        
    }
}
