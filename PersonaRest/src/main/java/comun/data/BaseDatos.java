package comun.data;

import org.springframework.data.jpa.repository.JpaRepository;

import comun.modelo.Persona;

public interface BaseDatos extends JpaRepository<Persona, Integer>{

}
