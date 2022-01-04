package cl.lramirez.spring.demorest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.lramirez.spring.demorest.models.Cliente;

@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
public class TestController {

	@RequestMapping("/version")
	String version() {
		return "LRQ 0.0.1";
	}

	@RequestMapping("/clientes")
	List<Cliente> clientes() {

		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente();
		c1.setNombre("Luis");
		c1.setApellido("Ramirez");
		c1.setDireccion("Mi casa 123");
		c1.setTelefono("87748833");

		Cliente c2 = new Cliente();
		c2.setNombre("Consuelo");
		c2.setApellido("Ramirez");
		c2.setDireccion("Mi casa 123");
		c2.setTelefono("73748833");

		clientes.add(c1);
		clientes.add(c2);
		return clientes;

	}

}
