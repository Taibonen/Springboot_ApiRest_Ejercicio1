package com.formacion.apirest.services;

import java.util.List;
import com.formacion.apirest.entity.Client;

public interface ClientService {

	//Metodo para mostrar todos los clientes
	public List<Client> allClientes();

	//Metodo que busca un cliente por id
	public Client findClientByNo_Cliente(Long id);
	
	//Metodo para guardar un cliente nuevo
	public Client saveClient(Client client);
	
	//metodo para borrar un registro
	public Client deleteClient(Long id);
}
