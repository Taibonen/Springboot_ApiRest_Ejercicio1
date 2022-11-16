package com.formacion.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.apirest.entity.Client;
import com.formacion.apirest.repository.ClientRepository;

/* Implementamos los metodos que definimos en la interfaz ClientService */
@Service
public class ClientServiceImpl implements ClientService{

	//Inyeccion de dependecia desde mi repositorio
	@Autowired
	private ClientRepository repositorio;
	
	
	@Override
	public List<Client> allClientes() {
		return (List<Client>) repositorio.findAll();
	}
		
	@Override
	@Transactional(readOnly = true)
	public Client findClientByNo_Cliente(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Client saveClient(Client client) {
		return repositorio.save(client);
		
	}
	
	@Override
	@Transactional
	public Client deleteClient(Long id)
	{
		Client client= new Client();
		client= findClientByNo_Cliente(id);
		repositorio.deleteById(id);
		return client;
	}
}
