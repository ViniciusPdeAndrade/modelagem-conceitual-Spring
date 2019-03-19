package br.vpd.andrade.cursmodconceitual.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.vpd.andrade.cursmodconceitual.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}") // pegar o valor da chave (dev.properties)
	private String strategy;
	
	
	@Bean // metodo responsavel por instanciar banco de dados no profile dev
	public boolean instantiateDatabase() throws ParseException {

		// testando  variavel 
		if(!"create".equals(strategy)){
			return false;
		}
		
		dbService.instantiateTestDatabase();
		return true;
	}

}
