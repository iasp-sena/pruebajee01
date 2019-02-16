package edu.iasp.pruebas.pruebajee01.services;

import edu.iasp.pruebas.pruebajee01.modelo.entities.Persona;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@Stateless
public class PruebaServices {

    private List<Persona> personas;

    private void init(){
        personas = new ArrayList<>();
        personas.add(new Persona(1,"Carlos", "Ramirez", "1234567890"));
        personas.add(new Persona(2,"Diego", "Gonzalez", "2345678901"));
        personas.add(new Persona(3,"Diana", "Bru", "3456789012"));
        personas.add(new Persona(4,"Laura", "Roa", "4567890123"));
        personas.add(new Persona(5,"Rocip", "Pérez", "5678901234"));
    }

    public List<Persona> getPersonas(){
        if(Objects.isNull(personas) || personas.isEmpty()){
            init();
        }
        return personas;
    }

    public Persona getPersona(){
        Random random = new Random();
        return getPersonas().get(random.nextInt(getPersonas().size()));
    }

    public  Persona getPersona(Integer id){
        List<Persona> result = getPersonas().stream().filter(p -> p.getId().intValue() == id).collect(Collectors.toList());
        return result.isEmpty() ? null : result.get(0);
    }
}
