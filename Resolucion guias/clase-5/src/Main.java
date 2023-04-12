import modelos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Congreso congreso = new Congreso();

        congreso.agregarDiputado("Jorge", 18, "Jujuy");
        congreso.agregarDiputado("Juan", 38, "Salta");
        congreso.agregarSenador("Camilia",22,"Mendoza");
        congreso.agregarSenador("Juana",22,"Catamarca");

        congreso.mostrarLegisladores();

        ListinProfesores profesores = new ListinProfesores();

        profesores.agregarProfesorInterino("Juan Carlos", 30);
        profesores.agregarProfesorTitular("Juani Hussen", 22);
        profesores.agregarProfesorTitular("Axel Rose", 44);
        profesores.agregarProfesorInterino("Jose Josesito", 32);
        profesores.mostrarProfesores();

    }
}