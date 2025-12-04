package fecha;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // En el main declaramos todos los metodos y los mostramos.
        LocalDate copia = Utilidadesfechas.copia(fecha);
        LocalDate fecha = LocalDate.now();
        System.out.println(Utilidadesfechas.copia(fecha));
        System.out.println("¿Es bisiesto?: " + Utilidadesfechas.mesBisiesto(fecha));
        
    }

