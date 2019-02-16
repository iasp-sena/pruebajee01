package edu.iasp.pruebas.pruebajee01.controllers;

import edu.iasp.pruebas.pruebajee01.modelo.entities.Persona;
import edu.iasp.pruebas.pruebajee01.services.PruebaServices;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Named
@ViewScoped
public class PruebaController implements Serializable {

    @Inject
    private transient Logger log;

    @Inject
    private PruebaServices ps;

    private String dato;
    private List<Persona> personas;
    private Persona persona;

    public PruebaController(){}

    @PostConstruct
    public void init(){
        dato = "Hola desde el controlador de prueba...";
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public List<Persona> getPersonas() {
        if(Objects.isNull(personas) || personas.isEmpty()){
            personas = ps.getPersonas();
        }
        return personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public  void consularPersonaRandom(){
        persona = ps.getPersona();
    }

    public  void consularPersonaPorId(Integer id){
        log.info("Llego al método con el dato: " + id);
        persona = ps.getPersona(id);
    }
}
