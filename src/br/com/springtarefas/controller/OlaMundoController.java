package br.com.springtarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "ola_mundo";
	}
}