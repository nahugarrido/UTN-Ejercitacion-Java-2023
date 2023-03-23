package modelos;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

// PREGUNTA: Es correcto utilizar el prefijo get pese a no estar obteniendo un atributo en si?
public class Vuelo {
    private String origen;
    private String destino;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    public Vuelo(String origen, String destino, LocalTime horaSalida, LocalTime horaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public void getInformacionVuelo() {
        System.out.println("El origen del vuelo es: " + origen);
        System.out.println("El destino del vuelo es: " + destino);
        System.out.println("La hora de salida es: " + horaSalida);
        System.out.println("La hora de llegada es: " + horaLlegada);
    }

    public void getDuracionVuelo() {
        Duration duracion = Duration.between(horaSalida, horaLlegada);
        double horas = duracion.toHours();
        double minutos = duracion.toMinutes() % 60;

        System.out.println("La duracion del vuelo es de " + horas + " horas y " + minutos + " minutos");
    }
}
