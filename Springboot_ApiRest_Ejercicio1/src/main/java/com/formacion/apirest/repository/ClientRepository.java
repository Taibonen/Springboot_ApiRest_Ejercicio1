package com.formacion.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacion.apirest.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{
	

}
