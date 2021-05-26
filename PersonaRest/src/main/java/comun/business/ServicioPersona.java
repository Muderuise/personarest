package comun.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import comun.data.BaseDatos;
import comun.modelo.Persona;

@Component
public class ServicioPersona {

	@Autowired
	BaseDatos baseDatos;

	public Persona damePersonaConId(int id) {		
		return baseDatos.getById(id);
	}	
	
}
