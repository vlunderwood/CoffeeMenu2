package coffee.config;

import org.springframework.context.annotation.Bean;

//@author valei - vlunderwood CIS175 - Fall 2023 Oct 15, 2023

import org.springframework.context.annotation.Configuration;

import coffee.beans.Menu;

@Configuration
public class MenuBeanConfig {
	@Bean
	public Menu menu() {
		Menu menu = new Menu();
		return menu;
		
	}
}
