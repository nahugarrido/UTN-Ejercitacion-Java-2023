package modelos;

import enums.Genero;
import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Libro implements I_ToJSON {
    private int id;
    private String titulo;
    private String autor;
    private String codigo;
    private Genero genero;

    public Libro(int id, String titulo, String autor, String codigo, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                ", genero=" + genero + ", ";
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Libro) {
            return this.id == ((Libro) aComparar).getId() && this.getTitulo().equals(((Libro) aComparar).getTitulo());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();

        json.put("titulo", this.getTitulo());
        json.put("autor", this.getAutor());
        json.put("codigo", this.getCodigo());
        json.put("genero", this.getGenero());

        return json;
    }
}
