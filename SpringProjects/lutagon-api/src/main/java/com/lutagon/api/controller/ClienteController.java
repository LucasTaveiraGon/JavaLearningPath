package com.lutagon.api.controller;

import java.util.List;

import com.lutagon.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
		public List<Cliente>listar() {
		return "Teste";
	}
}
