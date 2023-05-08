package br.com.exercicios.senhasspring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RunBeans {
	
	//Beans necessários, para não colocar tudo na classe principal
	
	//Encriptografia da senha
	@Bean
	public PasswordEncoder getPassWordEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
	
	

}
