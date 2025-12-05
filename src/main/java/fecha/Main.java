package fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        LocalDate finalCurso = LocalDate.of(2019,Month.JUNE, 25);

        LocalDateTime hoyy = LocalDateTime.now();
        LocalDateTime finalCursoo = LocalDateTime.of(2019, 6, 25, 0, 0);

        

        boolean bisiesto = Utilidadesfechas.mesBisiesto(finalCurso);

        int diasemana = Utilidadesfechas.diaSemana(finalCurso);
        
        Utilidadesfechas.mostrarFechaLarga(finalCurso);
        
        Utilidadesfechas.sumarDias(diasemana, finalCurso);
        
       System.out.println(Utilidadesfechas.diasTranscurridos(hoy, finalCurso));

       System.out.println(Utilidadesfechas.siguienteDia(finalCurso));
        
        System.out.println(Utilidadesfechas.siguienteDia(finalCurso));
        
        System.out.println(Utilidadesfechas.DiaAnterior(finalCurso));
       
        System.out.println(Utilidadesfechas.DiaAnterior(finalCurso));
        
        System.out.println(Utilidadesfechas.minutos(hoyy, finalCursoo));
       
        System.out.println(Utilidadesfechas.sumarSegundos(diasemana, finalCursoo));
        

  
        
    }

}