package br.vpd.andrade.cursmodconceitual.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.vpd.andrade.cursmodconceitual.services.DBService;

@Configuration
@Profile("test")
public class testConfig {

	@Autowired
	private DBService dbService;

	@Bean // metodo responsavel por instanciar banco de dados no profile test
	public boolean instantiateDatabase() throws ParseException {

		dbService.instantiateTestDatabase();
		return true;
	}

}
