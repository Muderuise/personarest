package comun;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import comun.business.ServicioPersona;
import comun.modelo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
/*
 * instalar plugin spring tools en eclipse
 */
@RestController
public class PersonaController {	
	@Autowired
	private ServicioPersona servicioPersona;
	
	//https://localhost:8080/damePersonaConId?id=1
	@PostMapping("/damePersonaConId")
	public Persona damePersonaConId(
			@RequestBody (required = true) int id) {		
		return servicioPersona.damePersonaConId(id);
	}
}
