package modelos;

import java.time.Duration;
import java.time.LocalTime;

// PREGUNTA: Es correcto utilizar el prefijo get pese a no estar obteniendo un atributo en si?
// RESPUESTA: No, no es correcto. Podria llegar a confundir a otro programador si ve nuestro codigo.

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

    /// Retorna la informacion del vuelo (origen, destino, hora de salida, hora de llegada)
    public String informacionVuelo() {
        return "\nEl origen del vuelo es: " + origen + "\nEl destino del vuelo es: " + destino + "\nLa hora de salida es: " + horaSalida + "\nLa hora de llegada es: " + horaLlegada;
    }

    /// Retorna la duracion del vuelo
    public String duracionVuelo() {

        Duration duracion = Duration.between(horaSalida, horaLlegada);

        double horas = duracion.toHours();
        double minutos = duracion.toMinutes() % 60;

        return "La duracion del vuelo es de " + horas + " horas y " + minutos + " minutos";
    }
}
