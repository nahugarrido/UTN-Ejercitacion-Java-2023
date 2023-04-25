package modelos;

import interfaces.ICarga;

import java.util.ArrayList;
import java.util.List;

public class AvionDeCarga extends Avion implements ICarga {
    private boolean capacidadCarga;
    private List<String> productosTransportar;

    public AvionDeCarga(String modelo, String marca, double capacidadCombustible, String tipoMotor, boolean isPrivado, boolean capacidadCarga) {
        super(modelo, marca, capacidadCombustible, tipoMotor, 0, isPrivado);
        this.capacidadCarga = capacidadCarga;
        this.productosTransportar = new ArrayList();
    }

    public String agregarProducto(String nombre) {
        productosTransportar.add(nombre);
        return "Producto agregado con exito";
    }


    @Override
    public boolean cargar(boolean cantidad) {
        return false;
    }
}
