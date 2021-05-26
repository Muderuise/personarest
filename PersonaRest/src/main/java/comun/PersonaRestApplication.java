package comun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import comun.config.Propiedades;

@SpringBootApplication
public class PersonaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaRestApplication.class, args);
	}

}
