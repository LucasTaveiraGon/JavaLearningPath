package com.lutagon.api.controller;

import java.util.Arrays;
import java.util.List;

import com.lutagon.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
		public List<Cliente>listar() {
			Cliente cliente1 = new Cliente();
			cliente1.setId(1L);
			cliente1.setNome("Joao");
			cliente1.setTelefone("xxxxxxx-xxx");
			cliente1.setEmail("xuxux@abrobrinha.com");

			Cliente cliente2 = new Cliente();
			cliente2.setId(2L);
			cliente2.setNome("Sasha");
			cliente2.setTelefone("xxxxxxx-xxx");
			cliente2.setEmail("xaxaxa@abrobrinha.com");

			Cliente cliente3 = new Cliente();
			cliente3.setId(3L);
			cliente3.setNome("SevenK");
			cliente3.setTelefone("xxxxxxx-xxx");
			cliente3.setEmail("xuxuddddddx@abrobrinha.com");
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
