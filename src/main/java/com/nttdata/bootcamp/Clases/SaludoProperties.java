package com.nttdata.bootcamp.Clases;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
public class SaludoProperties {

	private String idioma = "Castellano";
	
	public String getIdioma() {
		return idioma;
	}
	
	public String setIdioma(String idioma) {
		return this.idioma=idioma;
	}
	
}
