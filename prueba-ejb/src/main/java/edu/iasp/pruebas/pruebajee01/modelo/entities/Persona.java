package edu.iasp.pruebas.pruebajee01.modelo.entities;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {

    private Integer id;
    private String nombres;
    private String apellidos;
    private String documento;

    public Persona(){}

    public Persona(Integer id, String nombres, String apellidos, String documento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
