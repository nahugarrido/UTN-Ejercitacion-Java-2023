package org.example.modelos;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        if (validacion(hora, minutos, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            throw new IllegalArgumentException("Argumentos de inicializacion no validos");
        }

    }

    private boolean validacion(int hora, int minutos, int segundos) {
        boolean flag = true;
        if ((hora < 0 || hora > 23) || (minutos < 0 || minutos > 59) || (segundos < 0 || segundos > 59)) {
            flag = false;
        }
        return flag;
    }

    public String imprimirHora() {
        String horaNueva = String.valueOf(this.getHora());
        String minutoNuevo = String.valueOf(this.getMinutos());
        String segundoNuevo = String.valueOf(this.getSegundos());

        if (this.getHora() < 10) {
            horaNueva = "0" + this.getHora();
        }
        if (this.getMinutos() < 10) {
            minutoNuevo = "0" + this.getMinutos();
        }
        if (this.getSegundos() < 10) {
            segundoNuevo = "0" + this.getSegundos();
        }

        String texto = horaNueva + ":" + minutoNuevo + ":" + segundoNuevo;

        return texto;
    }

    public Hora avanzarUnSegundo() {
        this.setSegundos(this.getSegundos() + 1);
        if (this.getSegundos() == 60) {
            this.setSegundos(0);
            this.setMinutos(this.getMinutos() + 1);
            if (this.getMinutos() == 60) {
                this.setMinutos(0);
                this.setHora(this.getHora() + 1);
                if (this.getHora() == 24) {
                    this.setHora(0);
                }
            }
        }

        return this;
    }

    public Hora retrocederUnSegundo() {
        this.setSegundos(this.getSegundos() - 1);
        if(this.getSegundos() == -1) {
            this.setSegundos(59);
            this.setMinutos(this.getMinutos() - 1);
            if(this.getMinutos() == -1) {
                this.setMinutos(59);
                this.setHora(this.getHora() - 1);
                if(this.getHora() == -1) {
                    this.setHora(23);
                }
            }
        }

        return this;
    }

    public int getHora() {
        return hora;
    }

    private void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    private void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    private void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
