package com.formacion.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.apirest.entity.Client;
import com.formacion.apirest.services.ClientService;

@RestController
@RequestMapping("api/Clientes/")
public class ClientController {
	
	//Para usar ClientServices
	@Autowired
	private ClientService servicio;
	
	//Muestra todos los clientes
	@GetMapping("/todos")
	public List<Client> index(){
		return servicio.allClientes();
	}
	
	//Te devuelve un cliente pasandole el {id}
	@GetMapping("/Clientes/{id}")
	public Client show(@PathVariable Long id) {
		return servicio.findClientByNo_Cliente(id);
		
	}
	
	//Te permite guardar un cliente nuevo (POST)
	@PostMapping("/Clientes/Nuevo")
	@ResponseStatus(HttpStatus.CREATED)
	public Client save(@RequestBody Client client) {
		return servicio.saveClient(client);
	}
	
	
	//Te permite borrar un cliente
	@DeleteMapping("/Clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Client delete(@PathVariable Long id) {
		return servicio.deleteClient(id);
	}
	
	//Te permite updatear un cliente
	@PutMapping("/Clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Client update(@RequestBody Client client, @PathVariable Long id) {
		Client clientUpdate= servicio.findClientByNo_Cliente(id);
		
		clientUpdate.setNombre(client.getNombre());
		clientUpdate.setApellidos(client.getApellidos());
		clientUpdate.setSexo(client.getSexo());
		clientUpdate.setTelefono(client.getTelefono());
		
		return servicio.saveClient(clientUpdate);
	}
	
}
