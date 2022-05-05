package com.kreitek.rrhhpersonas;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> getAllPersons();

    Persona createPersona(Persona nuevaPersona);

    Optional<Persona> getPersona(Integer id);

    void deletePersona(Integer id);
}
