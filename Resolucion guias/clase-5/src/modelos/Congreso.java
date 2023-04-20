package modelos;

import java.util.ArrayList;
import java.util.List;

public class Congreso {
    private List<Legislador> legisladores = new ArrayList();

    public Congreso() {
    }

    public void agregarDiputado(String nombre, int edad, String provincia) {
        legisladores.add(new Diputado(nombre, edad, provincia));
    }

    public void agregarSenador(String nombre, int edad, String provincia) {
        legisladores.add(new Senador(nombre, edad, provincia));
    }

    public void mostrarLegisladores() {
        for (Legislador persona : legisladores) {
            System.out.print(persona.toString());
            System.out.println(" Camara: " + persona.getCamaraEnQueTrabaja());
        }
    }
}
