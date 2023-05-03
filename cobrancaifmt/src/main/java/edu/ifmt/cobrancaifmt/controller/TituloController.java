package edu.ifmt.cobrancaifmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt.model.Titulo;

@Controller //anotação controller do Spring
@RequestMapping("/titulos") //trazendo o mapeamento /titulos para todo o controller
class TituloController {
		
@RequestMapping("/novo") //mapeamento da url	
public String novo() { //metodo que retorna uma String com nome da view
	return "CadastroTitulo";
}
@RequestMapping(method = RequestMethod.POST)
public void salvar(Titulo titulo) {
	
}
}
