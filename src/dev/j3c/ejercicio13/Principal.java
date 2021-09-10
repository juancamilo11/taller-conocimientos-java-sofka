package dev.j3c.ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

    public static void main() {
        String patronFecha = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patronFecha);
        String fechaActual = simpleDateFormat.format(new Date());
        System.out.println("\nEjercicio #13: La fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS) es: " + fechaActual);
    }

}
